package com.kehai.mapper;

import com.kehai.pojo.SdkInterfaceInfo;
import com.kehai.pojo.SdkInterfaceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdkInterfaceInfoDao {
    long countByExample(SdkInterfaceInfoExample example);

    int deleteByExample(SdkInterfaceInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SdkInterfaceInfo record);

    int insertSelective(SdkInterfaceInfo record);

    List<SdkInterfaceInfo> selectByExample(SdkInterfaceInfoExample example);

    SdkInterfaceInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SdkInterfaceInfo record, @Param("example") SdkInterfaceInfoExample example);

    int updateByExample(@Param("record") SdkInterfaceInfo record, @Param("example") SdkInterfaceInfoExample example);

    int updateByPrimaryKeySelective(SdkInterfaceInfo record);

    int updateByPrimaryKey(SdkInterfaceInfo record);
}