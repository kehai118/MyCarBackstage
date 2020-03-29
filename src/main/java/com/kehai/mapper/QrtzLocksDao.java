package com.kehai.mapper;

import com.kehai.pojo.QrtzLocksExample;
import com.kehai.pojo.QrtzLocksKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzLocksDao {
    long countByExample(QrtzLocksExample example);

    int deleteByExample(QrtzLocksExample example);

    int deleteByPrimaryKey(QrtzLocksKey key);

    int insert(QrtzLocksKey record);

    int insertSelective(QrtzLocksKey record);

    List<QrtzLocksKey> selectByExample(QrtzLocksExample example);

    int updateByExampleSelective(@Param("record") QrtzLocksKey record, @Param("example") QrtzLocksExample example);

    int updateByExample(@Param("record") QrtzLocksKey record, @Param("example") QrtzLocksExample example);
}