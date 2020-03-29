package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.SysMenuDao;
import com.kehai.mapper.TopDao;
import com.kehai.pojo.SysMenu;
import com.kehai.service.SysMenuService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class  SysMenuServiceImpl implements SysMenuService {
    @Autowired
    SysMenuDao sysMenuDao;

    @Override
    public TopDao getDao() {
        return sysMenuDao;
    }

    @Override
    public DataGridResult findMenuByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());
        queryDTO.setSort("menu_id");
        final List<SysMenu> menuByPage = sysMenuDao.findMenuByPage(queryDTO);

        PageInfo<SysMenu> info=new PageInfo<>(menuByPage);

        final long total = info.getTotal();

        final DataGridResult dataGridResult = new DataGridResult(total, info.getList());

        return dataGridResult;
    }


    @Override
    public R deleteMenu(List<Long> ids) {
        for (Long id : ids) {
            if(id<51){
                return R.error("系统菜单不可删除");
            }
        }

        final int i = sysMenuDao.deleteMenu(ids);
        if(i>0){
            return R.ok();
        }else {
            return R.error(-200,"删除失败");
        }
    }

    @Override
    public R findMenu() {
        final List<SysMenu> menu = sysMenuDao.findMenu();
        //根目录
        final SysMenu sysMenu = new SysMenu();
        sysMenu.setMenuId(0L);
        sysMenu.setType(0);
        sysMenu.setParentId(-1L);
        sysMenu.setName("根目录");
        menu.add(sysMenu);

        return R.ok("menuList",menu);
    }

    @Override
    public R saveMenu(SysMenu menu) {
        final int i = sysMenuDao.insertSelective(menu);
        return i>0?R.ok():R.error();
    }

    @Override
    public R updateMenu(SysMenu menu) {
        final int i = sysMenuDao.updateByPrimaryKeySelective(menu);
        return i>0?R.ok():R.error();
    }

    @Override
    public List<String> findPermsByUserID(long userId) {
        final List<String> perms = sysMenuDao.findPermsByUserID(userId);
        final HashSet<String> set = new HashSet<>();
        for (String perm : perms) {
            if(perm!=null && !perm.equals("")){
                final String[] split = perm.split(",");
                for (String s : split) {
                    set.add(s.trim());
                }
            }
        }
        return set.stream().collect(Collectors.toList());
    }

    @Override
    public R findUserMenu(Long userId) {
        final List<Map<String, Object>> dirMenu = sysMenuDao.findDirMenuByUserId(userId);
        for (Map<String, Object> map : dirMenu) {
            final long menuId = Long.parseLong(map.get("menuId").toString());
            final List<Map<String, Object>> subMenu = sysMenuDao.findMenuNotButtonByUserId(userId, menuId);
            map.put("list",subMenu);
        }
        final List<String> perms =findPermsByUserID(userId);
        final R ok =R.ok();
        ok.put("menuList",dirMenu);
        ok.put("permissions",perms);
        return ok;
    }


}
