package com.kehai.mapper;

import com.kehai.pojo.ProductCarActivity;
import com.kehai.pojo.ProductCarActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCarActivityDao {
    long countByExample(ProductCarActivityExample example);

    int deleteByExample(ProductCarActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductCarActivity record);

    int insertSelective(ProductCarActivity record);

    List<ProductCarActivity> selectByExample(ProductCarActivityExample example);

    ProductCarActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductCarActivity record, @Param("example") ProductCarActivityExample example);

    int updateByExample(@Param("record") ProductCarActivity record, @Param("example") ProductCarActivityExample example);

    int updateByPrimaryKeySelective(ProductCarActivity record);

    int updateByPrimaryKey(ProductCarActivity record);
}