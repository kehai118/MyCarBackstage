package com.kehai.mapper;

import com.kehai.pojo.QrtzJobDetails;
import com.kehai.pojo.QrtzJobDetailsExample;
import com.kehai.pojo.QrtzJobDetailsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzJobDetailsDao {
    long countByExample(QrtzJobDetailsExample example);

    int deleteByExample(QrtzJobDetailsExample example);

    int deleteByPrimaryKey(QrtzJobDetailsKey key);

    int insert(QrtzJobDetails record);

    int insertSelective(QrtzJobDetails record);

    List<QrtzJobDetails> selectByExampleWithBLOBs(QrtzJobDetailsExample example);

    List<QrtzJobDetails> selectByExample(QrtzJobDetailsExample example);

    QrtzJobDetails selectByPrimaryKey(QrtzJobDetailsKey key);

    int updateByExampleSelective(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    int updateByExample(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    int updateByPrimaryKeySelective(QrtzJobDetails record);

    int updateByPrimaryKeyWithBLOBs(QrtzJobDetails record);

    int updateByPrimaryKey(QrtzJobDetails record);
}