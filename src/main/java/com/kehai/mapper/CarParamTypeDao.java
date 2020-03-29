package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarParamType;
import com.kehai.pojo.CarParamTypeExample;
import java.util.List;

import com.kehai.util.R;
import org.apache.ibatis.annotations.Param;

public interface CarParamTypeDao extends TopDao<CarParamType,CarParamTypeExample> {
    
    List<CarParamType> carParamsList(QueryDTO queryDTO);

    int deletesByIds(List<Long> ids);

    List<CarParamType> findCanUse();
}