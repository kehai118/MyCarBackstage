package com.kehai.mapper;

import com.kehai.pojo.AdminRole;
import com.kehai.pojo.AdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleDao {
    long countByExample(AdminRoleExample example);

    int deleteByExample(AdminRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminRole record);

    int insertSelective(AdminRole record);

    List<AdminRole> selectByExample(AdminRoleExample example);

    AdminRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    int updateByExample(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    int updateByPrimaryKeySelective(AdminRole record);

    int updateByPrimaryKey(AdminRole record);
}