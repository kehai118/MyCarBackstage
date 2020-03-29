package com.kehai.service;


import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Product;
import com.kehai.pojo.ProductExample;
import com.kehai.util.R;

import java.util.List;

public interface ProductService extends TopService<Product, ProductExample> {

    DataGridResult listByPage(QueryDTO queryDTO);

    R deletesByIds(List<Long> ids);
}
