package com.kehai.mapper;

import com.kehai.pojo.QrtzCronTriggers;
import com.kehai.pojo.QrtzCronTriggersExample;
import com.kehai.pojo.QrtzCronTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzCronTriggersDao {
    long countByExample(QrtzCronTriggersExample example);

    int deleteByExample(QrtzCronTriggersExample example);

    int deleteByPrimaryKey(QrtzCronTriggersKey key);

    int insert(QrtzCronTriggers record);

    int insertSelective(QrtzCronTriggers record);

    List<QrtzCronTriggers> selectByExample(QrtzCronTriggersExample example);

    QrtzCronTriggers selectByPrimaryKey(QrtzCronTriggersKey key);

    int updateByExampleSelective(@Param("record") QrtzCronTriggers record, @Param("example") QrtzCronTriggersExample example);

    int updateByExample(@Param("record") QrtzCronTriggers record, @Param("example") QrtzCronTriggersExample example);

    int updateByPrimaryKeySelective(QrtzCronTriggers record);

    int updateByPrimaryKey(QrtzCronTriggers record);
}