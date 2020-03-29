package com.kehai.mapper;

import com.kehai.pojo.DictModel;
import com.kehai.pojo.DictModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictModelDao {
    long countByExample(DictModelExample example);

    int deleteByExample(DictModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictModel record);

    int insertSelective(DictModel record);

    List<DictModel> selectByExample(DictModelExample example);

    DictModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictModel record, @Param("example") DictModelExample example);

    int updateByExample(@Param("record") DictModel record, @Param("example") DictModelExample example);

    int updateByPrimaryKeySelective(DictModel record);

    int updateByPrimaryKey(DictModel record);
}