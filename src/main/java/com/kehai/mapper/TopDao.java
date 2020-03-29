package com.kehai.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TopDao<T,V> {
    long countByExample(V example);

    int deleteByExample(V example);

    int deleteByPrimaryKey(Long userId);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(V example);

    T selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") T record, @Param("example") V example);

    int updateByExample(@Param("record") T record, @Param("example") V example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);}
