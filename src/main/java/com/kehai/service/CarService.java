package com.kehai.service;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Car;
import com.kehai.pojo.CarExample;
import com.kehai.util.R;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CarService extends TopService<Car, CarExample>{
    DataGridResult listByPage(QueryDTO queryDTO);

    @Transactional(propagation = Propagation.REQUIRED)
    R deletesByIds(List<Long> ids);
}
