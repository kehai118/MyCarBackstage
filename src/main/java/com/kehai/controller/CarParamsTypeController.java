package com.kehai.controller;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarParamType;
import com.kehai.pojo.CarParams;
import com.kehai.service.CarParamsTypeService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarParamsTypeController {

    @Autowired
    private CarParamsTypeService carParamsService;

    @GetMapping("/sys/paramtype/list")
    public DataGridResult CarParamsList(QueryDTO queryDTO){
        return  carParamsService.carParamsList(queryDTO);
    }

    @DeleteMapping("/sys/paramtype/del")
    public R deletesByIds(@RequestBody List<Long> ids){
        return   carParamsService.deletesByIds(ids);
    }

    @GetMapping("/sys/paramtype/info/{id}")
    public R CarParamsInfo(@PathVariable("id") Long id){
        return R.ok("paramtype", carParamsService.selectByPrimaryKey(id)) ;
    }

    @PutMapping("/sys/paramtype/save")
    public R saveCarParams(@RequestBody CarParamType carParams){
        return  carParamsService.insertSelective(carParams)>0?R.ok():R.error();
    }

    @PutMapping("/sys/paramtype/update")
    public R updateCarParams(@RequestBody CarParamType carParams){
        return  carParamsService.updateByPrimaryKeySelective(carParams)>0?R.ok():R.error();
    }
}
