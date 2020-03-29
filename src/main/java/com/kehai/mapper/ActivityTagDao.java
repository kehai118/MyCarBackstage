package com.kehai.mapper;

import com.kehai.pojo.ActivityTag;
import com.kehai.pojo.ActivityTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityTagDao {
    long countByExample(ActivityTagExample example);

    int deleteByExample(ActivityTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ActivityTag record);

    int insertSelective(ActivityTag record);

    List<ActivityTag> selectByExample(ActivityTagExample example);

    ActivityTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ActivityTag record, @Param("example") ActivityTagExample example);

    int updateByExample(@Param("record") ActivityTag record, @Param("example") ActivityTagExample example);

    int updateByPrimaryKeySelective(ActivityTag record);

    int updateByPrimaryKey(ActivityTag record);
}