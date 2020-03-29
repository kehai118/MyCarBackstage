package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.dto.RoleDTO;
import com.kehai.mapper.*;
import com.kehai.pojo.*;
import com.kehai.service.RoleService;
import com.kehai.util.R;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    SysRoleDao dao;

    @Autowired
    SysUserRoleDao roleUserDao;

    @Autowired
    SysRoleMenuDao roleMenuDao;

    @Autowired
    SysUserDao userDao;

    @Autowired
    SysMenuDao menuDao;

    @Override
    public List<String> findRolesNameByUserID(long userId) {
        return dao.selectRoleNameByUserID(userId);
    }

    @Override
    public List<String> findRoleNameByUserName(String userName) {
        return dao.selectrRoleNameByUserName(userName);
    }

    @Override
    public DataGridResult listByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());

        if (queryDTO.getSort()==null || queryDTO.getSort().equals("")){
            queryDTO.setSort("role_id");
        }

        final List<RoleDTO> makes = dao.listByPage(queryDTO);

        final PageInfo<RoleDTO> info = new PageInfo<>(makes);
        return new DataGridResult(info.getTotal(),info.getList());
    }

    @Override
    public R deletesByIds(List<Long> ids) {
        return dao.deletesByIds(ids)>0?R.ok():R.error();
    }

    @Override
    public int insertRoleDTO(RoleDTO roleDTO) {
        final SysRole role = new SysRole();
        BeanUtils.copyProperties(roleDTO,role);
        int result=dao.insertSelective(role);
        final Long roleId = role.getRoleId();


        if (!roleDTO.getPermsUser().isEmpty()){
            final List<SysUser> permsUser = roleDTO.getPermsUser();
            final List<SysUserRole> listUser = getListUser(roleId,permsUser);
            result*= roleUserDao.insertList(listUser);
        }

        if (!roleDTO.getDisPermsUser().isEmpty()){
            final List<SysUser> permsUser = roleDTO.getDisPermsUser();
            final List<SysUserRole> listUser = getListUser(roleId,permsUser);
           result*= roleUserDao.deleteList(listUser);
        }

        if (!roleDTO.getPermsMenu().isEmpty()){
            final List<SysMenu> permsUser = roleDTO.getPermsMenu();
            final List<SysRoleMenu> listMenu = getListMenu(roleId, permsUser);
           result*= roleMenuDao.insertList(listMenu);
        }

        if(!roleDTO.getDisPermsMenu().isEmpty()){
            final List<SysMenu> disPermsMenu = roleDTO.getDisPermsMenu();
            final List<SysRoleMenu> listMenu = getListMenu(roleId,disPermsMenu);
            result*= roleMenuDao.deleteList(listMenu);
        }
        return result;
    }

    private  List<SysUserRole> getListUser(@NotNull Long roleId, List<SysUser> names){
        final List<String> list = names.stream().map(SysUser::getUsername).collect(Collectors.toList());
        final List<Long> idByNameList = userDao.getIdByNameList(list);
        final List<SysUserRole> collect = idByNameList.stream().map(e -> {
            final SysUserRole sysUserRole = new SysUserRole();
            sysUserRole.setUserId(e);
            sysUserRole.setRoleId(roleId);
            return sysUserRole;
        }).collect(Collectors.toList());
        return collect;
    }

    private List<SysRoleMenu> getListMenu(@NotNull Long roleId,List<SysMenu> names){
        final List<String> list = names.stream().map(SysMenu::getName).collect(Collectors.toList());
        final List<Long> idByNameList =menuDao.getIdByNameList(list);
        final List<SysRoleMenu> collect = idByNameList.stream().map(e -> {
            final SysRoleMenu roleMenu = new SysRoleMenu();
            roleMenu.setMenuId(e);
            roleMenu.setRoleId(roleId);
            return roleMenu;
        }).collect(Collectors.toList());
       return collect;
    }

    @Override
    public int updateByPrimaryKeySelectiveDTO(RoleDTO roleDTO) {
        final SysRole role = new SysRole();
        BeanUtils.copyProperties(roleDTO,role);
       int result= dao.updateByPrimaryKeySelective(role);
        final Long roleId = role.getRoleId();

        if (!roleDTO.getPermsUser().isEmpty()){
            final List<SysUser> permsUser = roleDTO.getPermsUser();
            final List<SysUserRole> listUser = getListUser(roleId,permsUser);
            result*= roleUserDao.insertList(listUser);
        }

        if (!roleDTO.getDisPermsUser().isEmpty()){
            final List<SysUser> permsUser = roleDTO.getDisPermsUser();
            final List<SysUserRole> listUser = getListUser(roleId,permsUser);
            result*= roleUserDao.deleteList(listUser);
        }

        if (!roleDTO.getPermsMenu().isEmpty()){
            final List<SysMenu> permsUser = roleDTO.getPermsMenu();
            final List<SysRoleMenu> listMenu = getListMenu(roleId, permsUser);
            result*= roleMenuDao.insertList(listMenu);
        }

        if(!roleDTO.getDisPermsMenu().isEmpty()){
            final List<SysRoleMenu> listMenu = getListMenu(roleId,roleDTO.getDisPermsMenu());
            result*= roleMenuDao.deleteList(listMenu);
        }
        return result;
    }

    @Override
    public RoleDTO selectDtoByRoleId(Long id) {
        return dao.selectDtoByRoleId(id);
    }

    @Override
    public TopDao getDao() {
        return dao;
    }
}
