package com.kehai.mapper;

import com.kehai.pojo.QrtzSimpropTriggers;
import com.kehai.pojo.QrtzSimpropTriggersExample;
import com.kehai.pojo.QrtzSimpropTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzSimpropTriggersDao {
    long countByExample(QrtzSimpropTriggersExample example);

    int deleteByExample(QrtzSimpropTriggersExample example);

    int deleteByPrimaryKey(QrtzSimpropTriggersKey key);

    int insert(QrtzSimpropTriggers record);

    int insertSelective(QrtzSimpropTriggers record);

    List<QrtzSimpropTriggers> selectByExample(QrtzSimpropTriggersExample example);

    QrtzSimpropTriggers selectByPrimaryKey(QrtzSimpropTriggersKey key);

    int updateByExampleSelective(@Param("record") QrtzSimpropTriggers record, @Param("example") QrtzSimpropTriggersExample example);

    int updateByExample(@Param("record") QrtzSimpropTriggers record, @Param("example") QrtzSimpropTriggersExample example);

    int updateByPrimaryKeySelective(QrtzSimpropTriggers record);

    int updateByPrimaryKey(QrtzSimpropTriggers record);
}