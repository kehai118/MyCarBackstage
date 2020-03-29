package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarModel;
import com.kehai.pojo.CarModelExample;
import java.util.List;

import com.kehai.util.R;
import net.sf.jsqlparser.statement.select.Top;
import org.apache.ibatis.annotations.Param;

public interface CarModelDao  extends TopDao<CarModel,CarModelExample> {

    List<CarModel> listByPage(QueryDTO queryDTO);

    int deletesByIds(List<Long> ids);
}