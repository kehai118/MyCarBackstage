package com.kehai;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.SysMenuDao;
import com.kehai.mapper.SysRoleDao;
import com.kehai.mapper.SysRoleMenuDao;
import com.kehai.mapper.SysUserDao;
import com.kehai.pojo.SysMenu;
import com.kehai.pojo.SysRole;
import com.kehai.pojo.SysRoleMenu;
import com.kehai.pojo.SysUser;
import com.kehai.service.SysMenuService;
import com.kehai.service.SysUserService;
import com.kehai.util.IpUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class MycarApplicationTests {

    @Autowired
    SysUserService service;

    @Autowired
    SysMenuDao menuDao;

    @Autowired
    SysUserDao dao;

    @Autowired
    SysMenuService menuService;

    @Autowired
    SysRoleMenuDao roleMenuDao;

    @Autowired
    SysUserDao userDao;

    @Autowired
    SysRoleDao roleDao;

    @Test
    void roleTest(){
        final SysRole role = new SysRole();
        role.setCreateTime(new Date());
        role.setRoleName("kehai");
        final int i = roleDao.insertSelective(role);
        System.out.println("return::"+i);
        System.out.println("get:"+role.getRoleId());
    }

    @Test
    void testUser(){
        final List<Long> kehai = userDao.getIdByNameList(Stream.of("kehai","guest").collect(Collectors.toList()));
        kehai.forEach(System.out::println);
    }


    @Test
    void ipUtis(){
        System.out.println(IpUtils.getCity());
    }
    @Test
    void setRoleMenuDao(){


        final List<String> list = Stream.of("统计管理","标签饼图").collect(Collectors.toList());
        final List<Long> idByNameList =menuDao.getIdByNameList(list);

        idByNameList.forEach(System.out::println);

        final List<SysRoleMenu> collect = idByNameList.stream().map(e -> {
            final SysRoleMenu roleMenu = new SysRoleMenu();
            roleMenu.setMenuId(e);
            roleMenu.setRoleId(10l);
            return roleMenu;
        }).collect(Collectors.toList());

        System.out.println("sql:"+roleMenuDao.deleteList(collect));

        /*final SysRoleMenu menu = new SysRoleMenu();
        final SysRoleMenu menu1 = new SysRoleMenu();
        menu.setMenuId(100l);
        menu.setRoleId(100l);
        menu1.setRoleId(101l);
        menu1.setMenuId(100l);
        roleMenuDao.deleteList(Stream.of(menu,menu1).collect(Collectors.toList()));*/
    }


    @Test
    void contextLoads() {
        final List<String> perms = menuDao.findPermsByUserID(1l);

        final List<String> perms1 = menuService.findPermsByUserID(1l);
        perms1.forEach(System.out::println);



    }

}
