package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.*;

import java.util.List;

import com.kehai.util.R;
import org.apache.ibatis.annotations.Param;

public interface ActivityDao extends TopDao<Activity,ActivityExample>{
    int insert(ActivityWithBLOBs record);

    int insertSelective(ActivityWithBLOBs record);

    List<ActivityWithBLOBs> selectByExampleWithBLOBs(ActivityExample example);

    ActivityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityWithBLOBs record, @Param("example") ActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityWithBLOBs record, @Param("example") ActivityExample example);

    int updateByPrimaryKeySelective(ActivityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ActivityWithBLOBs record);

    List<ActivityWithBLOBs> listByPage(QueryDTO queryDTO);

    int deletesByIds(List<Long> ids);
}