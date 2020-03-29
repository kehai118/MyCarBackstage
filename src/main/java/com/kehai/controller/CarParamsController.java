package com.kehai.controller;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarParamType;
import com.kehai.pojo.CarParams;
import com.kehai.service.CarParamsService;
import com.kehai.service.CarParamsTypeService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarParamsController {

    @Autowired
    private CarParamsService carParamsService;

    @Autowired
    private CarParamsTypeService carParamsTypeService;

    @GetMapping("/sys/params/list")
    public DataGridResult CarParamsList(QueryDTO queryDTO){
        return  carParamsService.carParamsList(queryDTO);
    }

    @DeleteMapping("/sys/params/del")
    public R deletesByIds(@RequestBody List<Long> ids){
        return   carParamsService.deletesByIds(ids);
    }

    @GetMapping("/sys/params/info/{id}")
    public R CarParamsInfo(@PathVariable("id") Long id){
        return R.ok("params", carParamsService.selectByPrimaryKey(id)) ;
    }

    @PutMapping("/sys/params/save")
    public R saveCarParams(@RequestBody CarParams carParams){
        return  carParamsService.insertSelective(carParams)>0?R.ok():R.error();
    }

    @PutMapping("/sys/params/update")
    public R updateCarParams(@RequestBody CarParams carParams){
        return  carParamsService.updateByPrimaryKeySelective(carParams)>0?R.ok():R.error();
    }

    @GetMapping("/sys/params/typeall")
    public R allType(){
        final List<CarParamType> all = carParamsTypeService.canUse();
        return R.ok("sites",all);
    }
}
