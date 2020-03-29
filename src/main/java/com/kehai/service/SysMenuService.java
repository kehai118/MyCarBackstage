package com.kehai.service;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.SysMenu;
import com.kehai.pojo.SysMenuExample;
import com.kehai.util.R;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import java.util.List;

public interface SysMenuService extends TopService<SysMenu, SysMenuExample> {
    DataGridResult findMenuByPage(QueryDTO queryDTO);

    @Transactional(propagation = Propagation.REQUIRED)
    R deleteMenu(List<Long> ids);

    R findMenu();

    R saveMenu(SysMenu menu);
    R updateMenu(SysMenu menu);

    List<String> findPermsByUserID(long userId);

    R findUserMenu(Long userId);
}
