package com.kehai.mapper;

import com.kehai.pojo.SysRoleMenu;
import com.kehai.pojo.SysRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuDao {
    long countByExample(SysRoleMenuExample example);

    int deleteByExample(SysRoleMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    List<SysRoleMenu> selectByExample(SysRoleMenuExample example);

    SysRoleMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    int updateByExample(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);

    int deleteList(List<SysRoleMenu> collect);

    int insertList(List<SysRoleMenu> collect);
}