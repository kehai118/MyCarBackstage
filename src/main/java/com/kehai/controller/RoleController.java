package com.kehai.controller;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.dto.RoleDTO;
import com.kehai.pojo.SysMenu;
import com.kehai.pojo.SysRole;
import com.kehai.pojo.SysUser;
import com.kehai.service.RoleService;
import com.kehai.service.SysMenuService;
import com.kehai.service.SysUserService;
import com.kehai.util.R;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sys/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @Autowired
    SysMenuService menuService;

    @Autowired
    SysUserService userService;

    @GetMapping("/list")
    public DataGridResult ActivityList(QueryDTO queryDTO){
        return  roleService.listByPage(queryDTO);
    }

    @DeleteMapping("/del")
    public R deletesByIds(@RequestBody List<Long> ids){
        return   roleService.deletesByIds(ids);
    }

    /*@GetMapping("/info/{id}")
    public R ActivityInfo(@PathVariable("id") Long id){
        return R.ok("role", roleService.selectByPrimaryKey(id)) ;
    }*/
    @GetMapping("/perms/{id}")
    public R rolePerms(@PathVariable("id") Long id){
        final R r = new R();
        if(id==null || id.equals(0l)){
            final List<SysMenu> menuAll = menuService.findAll();
            final List<SysUser> usrAll = userService.findAll();
            r.put("disPermsMenu",menuAll);
            r.put("disPermsUser",usrAll);
            r.put("permsUser",new ArrayList<>());
            r.put("permsMenu",new ArrayList<>());
        }else {
            RoleDTO dto=roleService.selectDtoByRoleId(id);
            r.put("disPermsMenu",dto.getDisPermsMenu());
            r.put("disPermsUser",dto.getDisPermsUser());
            r.put("permsUser",dto.getPermsUser());
            r.put("permsMenu",dto.getPermsMenu());
            final SysRole sysRole = new SysRole();
            BeanUtils.copyProperties(dto,sysRole);
            r.put("role", sysRole);
        }
        return r ;
    }

    @PutMapping("/save")
    public R saveActivity(@RequestBody RoleDTO role){
        return  roleService.insertRoleDTO(role)>0?R.ok():R.error();
    }

    @PutMapping("/update")
    public R updateActivity(@RequestBody RoleDTO role){
        return  roleService.updateByPrimaryKeySelectiveDTO(role)>0?R.ok():R.error();
    }
}
