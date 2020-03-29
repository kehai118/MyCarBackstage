package com.kehai.service;


import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarModel;
import com.kehai.pojo.CarModelExample;
import com.kehai.util.R;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CarModelService extends TopService<CarModel, CarModelExample> {

    @Transactional(propagation = Propagation.REQUIRED)
    R deletesByIds(List<Long> ids);

    DataGridResult listByPage(QueryDTO queryDTO);
}
