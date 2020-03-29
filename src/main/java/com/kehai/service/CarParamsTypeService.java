package com.kehai.service;


import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarParamType;
import com.kehai.pojo.CarParamTypeExample;
import com.kehai.util.R;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CarParamsTypeService  extends TopService<CarParamType, CarParamTypeExample>{

    DataGridResult carParamsList(QueryDTO queryDTO);

    @Transactional(propagation = Propagation.REQUIRED)
    R deletesByIds(List<Long> ids);

    List<CarParamType> canUse();
}
