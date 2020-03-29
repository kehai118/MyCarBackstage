package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.SysMenu;
import com.kehai.pojo.SysMenuExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysMenuDao extends TopDao<SysMenu,SysMenuExample> {

    List<SysMenu> findMenuByPage(QueryDTO queryDTO);

    int deleteMenu(List<Long> list);

    List<SysMenu> findMenu();

    List<String> findPermsByUserID(long userId);

    //查询一级菜单
    List<Map<String,Object>> findDirMenuByUserId(Long userId);

    //查询一级目录对应的子菜单
    List<Map<String,Object>> findMenuNotButtonByUserId(@Param("userId") Long userId,@Param("parentId") Long parentId);

    List<Long> getIdByNameList(List<String> list);
}