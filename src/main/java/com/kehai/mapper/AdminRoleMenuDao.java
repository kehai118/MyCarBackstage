package com.kehai.mapper;

import com.kehai.pojo.AdminRoleMenuExample;
import com.kehai.pojo.AdminRoleMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleMenuDao {
    long countByExample(AdminRoleMenuExample example);

    int deleteByExample(AdminRoleMenuExample example);

    int deleteByPrimaryKey(AdminRoleMenuKey key);

    int insert(AdminRoleMenuKey record);

    int insertSelective(AdminRoleMenuKey record);

    List<AdminRoleMenuKey> selectByExample(AdminRoleMenuExample example);

    int updateByExampleSelective(@Param("record") AdminRoleMenuKey record, @Param("example") AdminRoleMenuExample example);

    int updateByExample(@Param("record") AdminRoleMenuKey record, @Param("example") AdminRoleMenuExample example);
}