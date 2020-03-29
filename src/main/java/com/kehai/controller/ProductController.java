package com.kehai.controller;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Product;
import com.kehai.pojo.ProductWithBLOBs;
import com.kehai.service.ProductService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys/product")
public class ProductController {
    @Autowired
    ProductService productService;


    @GetMapping("/list")
    public DataGridResult ProductList(QueryDTO queryDTO){
        return  productService.listByPage(queryDTO);
    }

    @DeleteMapping("/del")
    public R deletesByIds(@RequestBody List<Long> ids){
        return   productService.deletesByIds(ids);
    }

    @GetMapping("/info/{id}")
    public R ProductInfo(@PathVariable("id") Long id){
        return R.ok("product", productService.selectByPrimaryKey(id)) ;
    }

    @PutMapping("/save")
    public R saveProduct(@RequestBody ProductWithBLOBs Product){
        return  productService.insertSelective(Product)>0?R.ok():R.error();
    }

    @PutMapping("/update")
    public R updateProduct(@RequestBody ProductWithBLOBs Product){
        return  productService.updateByPrimaryKeySelective(Product)>0?R.ok():R.error();
    }

}
