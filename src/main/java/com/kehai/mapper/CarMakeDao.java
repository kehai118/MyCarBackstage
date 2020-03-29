package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarMake;
import com.kehai.pojo.CarMakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarMakeDao extends TopDao<CarMake,CarMakeExample> {

    int deletesByIds(List<Long> ids);

    List<CarMake> listByPage(QueryDTO queryDTO);

}