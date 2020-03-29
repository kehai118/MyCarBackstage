package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.CarParamsDao;
import com.kehai.mapper.TopDao;
import com.kehai.pojo.CarParams;
import com.kehai.pojo.CarParamsExample;
import com.kehai.service.CarParamsService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.List;

@Service
public class CarParamsServiceImpl implements CarParamsService {
    @Autowired
    private CarParamsDao carParamsDao;

    @Override
    public DataGridResult carParamsList(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());

        
        if (queryDTO.getSort()==null || queryDTO.getSort().equals("")){
            queryDTO.setSort("id");
        }

        final List<CarParams> makes = carParamsDao.carParamsList(queryDTO);

        final PageInfo<CarParams> info = new PageInfo<>(makes);
        return new DataGridResult(info.getTotal(),info.getList());
    }

    @Override
    public R deletesByIds(List<Long> ids) {
        return carParamsDao.deletesByIds(ids)>0?R.ok():R.error();
    }

    @Override
    public TopDao getDao() {
        return carParamsDao;
    }
}
