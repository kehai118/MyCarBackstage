package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.CarManufacturerDao;
import com.kehai.mapper.TopDao;
import com.kehai.pojo.CarManufacturer;
import com.kehai.service.CarManufacturerService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;

@Service
public class CarManufacturerServiceImpl implements CarManufacturerService {
    @Autowired
    private CarManufacturerDao dao;
    
    @Override
    public DataGridResult listByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());


        if (queryDTO.getSort()==null || queryDTO.getSort().equals("")){
            queryDTO.setSort("id");
        }

        final List<CarManufacturer> makes = dao.listByPage(queryDTO);

        final PageInfo<CarManufacturer> info = new PageInfo<>(makes);
        return new DataGridResult(info.getTotal(),info.getList());
    }

    @Override
    public R deletesByIds(List<Long> ids) {
        return dao.deletesByIds(ids)>0?R.ok():R.error();
    }

    @Override
    public TopDao getDao() {
        return dao;
    }
}
