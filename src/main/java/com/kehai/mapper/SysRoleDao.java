package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.dto.RoleDTO;
import com.kehai.dto.UserDTO;
import com.kehai.pojo.SysMenu;
import com.kehai.pojo.SysRole;
import com.kehai.pojo.SysRoleExample;
import java.util.List;

import com.kehai.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

public interface SysRoleDao  extends TopDao<SysRole,SysRoleExample>{
    List<String> selectRoleNameByUserID(Long userId);
    List<String> selectrRoleNameByUserName(String userName);

    List<RoleDTO> listByPage(QueryDTO queryDTO);


    List<SysUser> selectPermsUser(Long roleId);
    List<SysUser> selectDisPermsUser(Long roleId);
    List<SysMenu> selectPermsMenu(Long roleId);
    List<SysMenu> selectDisPermsMenu(Long roleId);

    int deletesByIds(List<Long> ids);

    RoleDTO selectDtoByRoleId(Long id);
}