package com.kehai.service;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarMake;
import com.kehai.pojo.CarMakeExample;
import com.kehai.util.R;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CarMakeService extends TopService<CarMake, CarMakeExample>{
    DataGridResult carMakeList(QueryDTO queryDTO);
    @Transactional(propagation = Propagation.REQUIRED)
    R deletesByIds(List<Long> ids);
}
