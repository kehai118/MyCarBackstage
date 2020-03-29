package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarParams;
import com.kehai.pojo.CarParamsExample;
import java.util.List;

import com.kehai.util.R;
import org.apache.ibatis.annotations.Param;

public interface CarParamsDao extends TopDao<CarParams,CarParamsExample> {

    int deletesByIds(List<Long> ids);

    List<CarParams> carParamsList(QueryDTO queryDTO);
}