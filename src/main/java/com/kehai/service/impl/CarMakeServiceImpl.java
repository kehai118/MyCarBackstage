package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.CarMakeDao;
import com.kehai.mapper.TopDao;
import com.kehai.pojo.CarMake;
import com.kehai.pojo.CarMakeExample;
import com.kehai.service.CarMakeService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarMakeServiceImpl implements CarMakeService {
    @Autowired
    private CarMakeDao carMakeDao;

    @Override
    public DataGridResult carMakeList(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());

        if (queryDTO.getSort()==null || queryDTO.getSort().equals("")){
            queryDTO.setSort("id");
        }

        final List<CarMake> makes =  carMakeDao.listByPage(queryDTO);

        final PageInfo<CarMake> info = new PageInfo<>(makes);
        return new DataGridResult(info.getTotal(),info.getList());
    }

    @Override
    public R deletesByIds(List<Long> ids) {
        int i=carMakeDao.deletesByIds(ids);
        return i>0?R.ok():R.error();
    }

    @Override
    public TopDao getDao() {
        return carMakeDao;
    }
}
