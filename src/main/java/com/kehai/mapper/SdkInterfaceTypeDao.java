package com.kehai.mapper;

import com.kehai.pojo.SdkInterfaceType;
import com.kehai.pojo.SdkInterfaceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdkInterfaceTypeDao {
    long countByExample(SdkInterfaceTypeExample example);

    int deleteByExample(SdkInterfaceTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SdkInterfaceType record);

    int insertSelective(SdkInterfaceType record);

    List<SdkInterfaceType> selectByExample(SdkInterfaceTypeExample example);

    SdkInterfaceType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SdkInterfaceType record, @Param("example") SdkInterfaceTypeExample example);

    int updateByExample(@Param("record") SdkInterfaceType record, @Param("example") SdkInterfaceTypeExample example);

    int updateByPrimaryKeySelective(SdkInterfaceType record);

    int updateByPrimaryKey(SdkInterfaceType record);
}