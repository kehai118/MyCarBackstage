package com.kehai.service;

import com.kehai.dto.ActivityDTO;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.ActivityDao;
import com.kehai.pojo.Activity;
import com.kehai.pojo.ActivityExample;
import com.kehai.pojo.ActivityWithBLOBs;
import com.kehai.pojo.ProductWithBLOBs;
import com.kehai.util.R;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ActivityService extends TopService<Activity, ActivityExample> {
    DataGridResult listByPage(QueryDTO queryDTO);

    @Override
    ActivityWithBLOBs selectByPrimaryKey(Long id);

    int insertSelective(ActivityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ActivityWithBLOBs record);

    @Transactional(propagation = Propagation.REQUIRED)
    R deletesByIds(List<Long> ids);

    ActivityWithBLOBs explainDto(ActivityDTO dto);
    ActivityDTO exchangeDto(ActivityWithBLOBs activity);
}
