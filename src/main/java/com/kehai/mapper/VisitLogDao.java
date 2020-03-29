package com.kehai.mapper;

import com.kehai.pojo.VisitLog;
import com.kehai.pojo.VisitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitLogDao {
    long countByExample(VisitLogExample example);

    int deleteByExample(VisitLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VisitLog record);

    int insertSelective(VisitLog record);

    List<VisitLog> selectByExample(VisitLogExample example);

    VisitLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VisitLog record, @Param("example") VisitLogExample example);

    int updateByExample(@Param("record") VisitLog record, @Param("example") VisitLogExample example);

    int updateByPrimaryKeySelective(VisitLog record);

    int updateByPrimaryKey(VisitLog record);
}