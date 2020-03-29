package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarManufacturer;
import com.kehai.pojo.CarManufacturerExample;
import java.util.List;

import com.kehai.util.R;
import org.apache.ibatis.annotations.Param;

public interface CarManufacturerDao extends TopDao<CarManufacturer,CarManufacturerExample> {

    List<CarManufacturer> listByPage(QueryDTO queryDTO);

    int deletesByIds(List<Long> ids);
}