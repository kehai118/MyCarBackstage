package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.CarModelDao;
import com.kehai.mapper.TopDao;
import com.kehai.pojo.CarModel;
import com.kehai.service.CarModelService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarModelServiceImpl implements CarModelService {
    @Autowired
    private CarModelDao dao;

    @Override
    public DataGridResult listByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());


        if (queryDTO.getSort()==null || queryDTO.getSort().equals("")){
            queryDTO.setSort("id");
        }

        final List<CarModel> makes = dao.listByPage(queryDTO);

        final PageInfo<CarModel> info = new PageInfo<>(makes);
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
