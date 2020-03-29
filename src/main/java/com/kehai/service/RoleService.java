package com.kehai.service;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.dto.RoleDTO;
import com.kehai.pojo.SysRole;
import com.kehai.pojo.SysRoleExample;
import com.kehai.util.R;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RoleService extends TopService<SysRole, SysRoleExample> {
    List<String> findRolesNameByUserID(long userId);
    List<String> findRoleNameByUserName(String userName);

    DataGridResult listByPage(QueryDTO queryDTO);
    @Transactional(propagation = Propagation.REQUIRED)
    R deletesByIds(List<Long> ids);

    @Transactional(propagation = Propagation.REQUIRED)
    int insertRoleDTO(RoleDTO role);
    @Transactional(propagation = Propagation.REQUIRED)
    int updateByPrimaryKeySelectiveDTO(RoleDTO role);

    RoleDTO selectDtoByRoleId(Long id);
}
