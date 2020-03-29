package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.ProductDao;
import com.kehai.mapper.TopDao;
import com.kehai.pojo.Product;
import com.kehai.pojo.ProductWithBLOBs;
import com.kehai.service.ProductService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService {
    @Autowired
    ProductDao dao;

    @Override
    public TopDao getDao() {
        return dao;
    }

    @Override
    public ProductWithBLOBs selectByPrimaryKey(Long id) {
        return (ProductWithBLOBs) dao.selectByPrimaryKey(id);
    }

    @Override
    public DataGridResult listByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());


        if (queryDTO.getSort()==null || queryDTO.getSort().equals("")){
            queryDTO.setSort("id");
        }

        final List<ProductWithBLOBs> makes = dao.listByPage(queryDTO);

        final PageInfo<ProductWithBLOBs> info = new PageInfo<>(makes);
        return new DataGridResult(info.getTotal(),info.getList());
    }

    @Override
    public R deletesByIds(List<Long> ids) {
        return dao.deletesByIds(ids)>0?R.ok():R.error();
    }
}
