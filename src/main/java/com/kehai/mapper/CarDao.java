package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Car;
import com.kehai.pojo.CarExample;
import com.kehai.util.R;

import java.util.List;


public interface CarDao extends TopDao<Car,CarExample> {


    int deletesByIds(List<Long> ids);

    List<Car> listByPage(QueryDTO queryDTO);
}