package com.kehai.controller;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.log.MyLog;
import com.kehai.pojo.SysMenu;
import com.kehai.pojo.SysUser;
import com.kehai.service.SysMenuService;
import com.kehai.util.R;
import java.util.List;

import com.kehai.util.ShiroUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SysMenuController {
    @Autowired
    SysMenuService sysMenuService;


    @MyLog("菜单列表")
    @GetMapping("/sys/menu/list")
    public DataGridResult menuList(QueryDTO queryDTO){
        return sysMenuService.findMenuByPage(queryDTO);
    }

    @DeleteMapping("/sys/menu/del")
    public R deleteMenu(@RequestBody List<Long> ids){
        return sysMenuService.deleteMenu(ids);
    }

    @GetMapping("/sys/menu/select")
    public R selectMenu(){
        return sysMenuService.findMenu();
    }

    @PutMapping("/sys/menu/save")
    public R insetMenu(@RequestBody SysMenu sysMenu){
        return sysMenuService.saveMenu(sysMenu);
    }

    @PutMapping("/sys/menu/update")
    public R updateMenu(@RequestBody SysMenu sysMenu){
        return sysMenuService.updateMenu(sysMenu);
    }

    @GetMapping("/sys/menu/info/{id}")
    public R getMenu(@PathVariable Long id){
        final SysMenu sysMenu = sysMenuService.selectByPrimaryKey(id);
        return  R.ok("menu",sysMenu);
    }

    @GetMapping("/sys/menu/user")
    public R userMenu(){
        final SysUser user = (SysUser) SecurityUtils.getSubject().getPrincipal();
        final R userMenu = sysMenuService.findUserMenu(user.getUserId());

        return userMenu;
    }
}
