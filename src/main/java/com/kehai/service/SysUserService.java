package com.kehai.service;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.SysUser;
import com.kehai.pojo.SysUserExample;
import com.kehai.util.R;
import java.util.List;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface SysUserService extends TopService<SysUser, SysUserExample> {
    DataGridResult findUserByPage(QueryDTO queryDTO);
    Workbook exportUser();
    SysUser findUserByName(String userName);
    R alterUser(SysUser user);
    @Transactional(propagation = Propagation.REQUIRED)
    R deleteUsersByIds(List<Long> ids);
    R saveUser(SysUser user);
}
