package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.SysUserDao;
import com.kehai.mapper.TopDao;
import com.kehai.pojo.SysUser;
import com.kehai.service.SysUserService;
import com.kehai.util.ExportExcel;
import com.kehai.util.MD5Utils;
import com.kehai.util.R;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserDao sysUserMapper;

    @Override
    public TopDao getDao() {
        return sysUserMapper;
    }

    @Override
    public DataGridResult findUserByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());

//        if(queryDTO.getSort()!=null && queryDTO.getSort().equals("")) {
//            queryDTO.setSort("user_id");
//        }

        final List<SysUser> page = sysUserMapper.findUserByPage(queryDTO);

        PageInfo<SysUser> info=new PageInfo<>(page);

        final long total = info.getTotal();

        final DataGridResult dataGridResult = new DataGridResult(total, info.getList());

        return dataGridResult;
    }

    @Override
    public Workbook exportUser() {
        final List<Map<String, Object>> maps = sysUserMapper.exportUser();
        String title="用户表格";
        String titles[]={"用户id","用户名","邮箱","电话","创建时间"};
        String columns[]={};
        if(maps.isEmpty()) return  null;
        final Map<String, Object> stringObjectMap = maps.get(0);
        final String[] strings = stringObjectMap.keySet().toArray(columns);
        return ExportExcel.export(title,titles,strings,maps);
    }

    @Override
    public SysUser findUserByName(String userName) {
        return sysUserMapper.findUserByName(userName);
    }

    @Override
    public R alterUser(SysUser user) {
        if(user.getUserId()<4) return  R.error("系统用户不允许修改");
        user.setPassword(MD5Utils.md5(user.getPassword(),user.getUsername(),1024));
        final int i = sysUserMapper.updateByPrimaryKeySelective(user);
        return i>0?R.ok():R.error("修改失败,请联系管理员");
    }

    @Override
    public R deleteUsersByIds(List<Long> ids) {
        for (Long id :ids){
            if(id<4) return  R.error("系统用户无法删除");
        }
        final int i = sysUserMapper.deleteUsersByIds(ids);
        return  i>0?R.ok():R.error("删除失败,请联系管理员");

    }

    @Override
    public R saveUser(SysUser user) {
        user.setCreateTime(new Date());
        user.setStatus((byte) 1);
        final int i = insertSelective(user);
        return i>0?R.ok():R.error("新建失败，请联系管理员");
    }
}
