package com.kehai.mapper;

import java.util.List;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Product;
import com.kehai.pojo.ProductExample;
import com.kehai.pojo.ProductWithBLOBs;
import com.kehai.util.R;
import org.apache.ibatis.annotations.Param;

public interface ProductDao extends TopDao<Product, ProductExample>{

    int insert(ProductWithBLOBs record);

    int insertSelective(ProductWithBLOBs record);

    List<ProductWithBLOBs> selectByExampleWithBLOBs(ProductExample example);

    ProductWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductWithBLOBs record, @Param("example") ProductExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductWithBLOBs record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(ProductWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductWithBLOBs record);

    List<ProductWithBLOBs> listByPage(QueryDTO queryDTO);

    int deletesByIds(List<Long> ids);
}