package com.kehai.mapper;

import com.kehai.pojo.QrtzBlobTriggers;
import com.kehai.pojo.QrtzBlobTriggersExample;
import com.kehai.pojo.QrtzBlobTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzBlobTriggersDao {
    long countByExample(QrtzBlobTriggersExample example);

    int deleteByExample(QrtzBlobTriggersExample example);

    int deleteByPrimaryKey(QrtzBlobTriggersKey key);

    int insert(QrtzBlobTriggers record);

    int insertSelective(QrtzBlobTriggers record);

    List<QrtzBlobTriggers> selectByExampleWithBLOBs(QrtzBlobTriggersExample example);

    List<QrtzBlobTriggers> selectByExample(QrtzBlobTriggersExample example);

    QrtzBlobTriggers selectByPrimaryKey(QrtzBlobTriggersKey key);

    int updateByExampleSelective(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    int updateByExample(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    int updateByPrimaryKeySelective(QrtzBlobTriggers record);

    int updateByPrimaryKeyWithBLOBs(QrtzBlobTriggers record);
}