package com.kehai.mapper;

import com.kehai.pojo.QrtzSimpleTriggers;
import com.kehai.pojo.QrtzSimpleTriggersExample;
import com.kehai.pojo.QrtzSimpleTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzSimpleTriggersDao {
    long countByExample(QrtzSimpleTriggersExample example);

    int deleteByExample(QrtzSimpleTriggersExample example);

    int deleteByPrimaryKey(QrtzSimpleTriggersKey key);

    int insert(QrtzSimpleTriggers record);

    int insertSelective(QrtzSimpleTriggers record);

    List<QrtzSimpleTriggers> selectByExample(QrtzSimpleTriggersExample example);

    QrtzSimpleTriggers selectByPrimaryKey(QrtzSimpleTriggersKey key);

    int updateByExampleSelective(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    int updateByExample(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    int updateByPrimaryKeySelective(QrtzSimpleTriggers record);

    int updateByPrimaryKey(QrtzSimpleTriggers record);
}