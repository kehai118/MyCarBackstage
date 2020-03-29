package com.kehai.service;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarParams;
import com.kehai.pojo.CarParamsExample;
import com.kehai.util.R;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CarParamsService extends TopService<CarParams, CarParamsExample> {
    DataGridResult carParamsList(QueryDTO queryDTO);
    @Transactional(propagation = Propagation.REQUIRED)
    R deletesByIds(List<Long> ids);
}
