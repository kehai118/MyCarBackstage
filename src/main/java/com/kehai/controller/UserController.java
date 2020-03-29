package com.kehai.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.dto.UserDTO;
import com.kehai.mapper.SysUserDao;
import com.kehai.pojo.SysUser;
import com.kehai.service.SysMenuService;
import com.kehai.service.SysUserService;
import com.kehai.util.MD5Utils;
import com.kehai.util.R;
import com.kehai.util.ShiroUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.*;

@RestController
public class UserController {
    @Autowired
    SysUserService sysUserService;
    @Autowired
    DefaultKaptcha kaptcha;

    @Autowired
    SysUserDao sysUserDao;

    @PostMapping("/sys/login")
    public R login(@RequestBody UserDTO userDTO){

        if(StringUtils.isEmpty(userDTO.getUsername()) || StringUtils.isEmpty(userDTO.getPassword()))
            return R.error("请填写用户名和密码");

        if(userDTO.getCaptcha()==null || userDTO.getCaptcha().equals("")){
            return R.error("请填写验证码");
        }

        if(!userDTO.getCaptcha().equals(ShiroUtils.getKaptcha())){
            return R.error("验证码错误");
        }

        Subject subject = SecurityUtils.getSubject();

        final String md5 = MD5Utils.md5(userDTO.getPassword(), userDTO.getUsername(), 1024);

        UsernamePasswordToken token = new UsernamePasswordToken(userDTO.getUsername(),md5);
        token.setRememberMe(userDTO.isRememberMe());

        try {
            subject.login(token);
            Subject currentUser = SecurityUtils.getSubject();
            Session session = currentUser.getSession();
            return  R.ok();
        }catch (UnknownAccountException e){
            return R.error("用户不存在");
        }catch (IncorrectCredentialsException e){
            return R.error("密码不匹配");
        }catch (LockedAccountException e){
            return R.error("用户被冻结");
        } catch (AuthenticationException e) {
            return R.error("未知问题，请联系管理员");
        }
    }

    @GetMapping("/sys/user/list")
    public DataGridResult userList(QueryDTO queryDTO){
        return sysUserService.findUserByPage(queryDTO);
    }

    @GetMapping("/sys/user/export")
    public void exportUser(HttpServletResponse response){
        final Workbook workbook = sysUserService.exportUser();
        try {
            response.setContentType("application/octet-stream");
            String fileName="员工信息.xls";
            final String encode = URLEncoder.encode(fileName, "utf-8");
            response.setHeader("content-disposition","attachment;filename="+fileName);
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/sys/user/info/{id}")
    public R updateUser(@PathVariable("id") Long userId){
        final SysUser sysUser = sysUserService.selectByPrimaryKey(userId);
        return R.ok("user",sysUser);
    }

    @PostMapping("/sys/user/save")
    public R saveUser(@RequestBody SysUser user){
        return  sysUserService.saveUser(user);
    }

    @PostMapping("/sys/user/update")
    public R updateUser(@RequestBody SysUser user){
        return sysUserService.alterUser(user);
    }

    @DeleteMapping("/sys/user/del")
    public R deleteUser(@RequestBody List<Long> ids){
        return   sysUserService.deleteUsersByIds(ids);
    }

    @GetMapping("/captcha.jpg")
    public void captcha(HttpServletResponse response){
        response.setHeader("Cache-Control","no-store, no-cache");
        response.setContentType("image/jpg");

        final String text = kaptcha.createText();
        final BufferedImage image = kaptcha.createImage(text);

        ShiroUtils.setKaptcha(text);

        try {
            final ServletOutputStream outputStream = response.getOutputStream();
            ImageIO.write(image,"jpg",outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/sys/user/info")
    public R userInfo(){
        final SysUser sysUser = (SysUser) SecurityUtils.getSubject().getPrincipal();
        return R.ok("user",sysUser);
    }

    @PostMapping("/sys/user/password")
    public R updatePassword(String password,String newPassword){

        final Long userId = ShiroUtils.getUserEntity().getUserId();

        final SysUser user = sysUserService.selectByPrimaryKey(userId);

        if (!MD5Utils.md5(password,user.getUsername(),1024).equals(user.getPassword())) {
            return  R.error("原密码不正确");
        }

        user.setPassword(MD5Utils.md5(newPassword,user.getUsername(),1024));

        final int i = sysUserService.updateByPrimaryKeySelective(user);

        return i>0?R.ok():R.error("未知失败,请联系管理员");
    }

}
