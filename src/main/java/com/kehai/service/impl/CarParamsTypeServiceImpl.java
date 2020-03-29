package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.CarParamTypeDao;
import com.kehai.mapper.TopDao;
import com.kehai.pojo.CarParamType;
import com.kehai.service.CarParamsTypeService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarParamsTypeServiceImpl implements CarParamsTypeService {
    @Autowired
    private CarParamTypeDao carParamTypeDao;

    @Override
    public DataGridResult carParamsList(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());


        if (queryDTO.getSort()==null || queryDTO.getSort().equals("")){
            queryDTO.setSort("id");
        }

        final List<CarParamType> makes = carParamTypeDao.carParamsList(queryDTO);

        final PageInfo<CarParamType> info = new PageInfo<>(makes);
        return new DataGridResult(info.getTotal(),info.getList());
    }

    @Override
    public R deletesByIds(List<Long> ids) {
        return carParamTypeDao.deletesByIds(ids)>0?R.ok():R.error();
    }

    @Override
    public List<CarParamType> canUse() {
        return carParamTypeDao.findCanUse();
    }

    @Override
    public TopDao getDao() {
        return carParamTypeDao;
    }
}
