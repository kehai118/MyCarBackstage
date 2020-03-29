package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.SysUser;
import com.kehai.pojo.SysUserExample;
import java.util.List;
import java.util.Map;

import com.kehai.util.R;
import org.apache.ibatis.annotations.Param;

public interface SysUserDao extends TopDao<SysUser,SysUserExample> {
    List<SysUser> findUserByPage(QueryDTO queryDTO);
    List<Map<String,Object>> exportUser();
    SysUser findUserByName(String name);

    int deleteUsersByIds(List<Long> ids);

    List<Long> getIdByNameList(List<String> names);
}