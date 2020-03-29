package com.kehai.controller;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarMake;
import com.kehai.pojo.CarModel;
import com.kehai.service.CarMakeService;
import com.kehai.service.CarModelService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarModelController {

    @Autowired
    private CarModelService carModelService;

    @Autowired
    private CarMakeService carMakeService;


    @GetMapping("/sys/model/list")
    public DataGridResult carMakeList(QueryDTO queryDTO){
        return  carModelService.listByPage(queryDTO);
    }

    @DeleteMapping("/sys/model/del")
    public R deletesByIds(@RequestBody List<Long> ids){
        return   carModelService.deletesByIds(ids);
    }

    @GetMapping("/sys/model/info/{id}")
    public R carMakeInfo(@PathVariable("id") Long id){
        return R.ok("model", carModelService.selectByPrimaryKey(id)) ;
    }

    @PutMapping("/sys/model/save")
    public R saveCarModel(@RequestBody CarModel carMake){
        return  carModelService.insertSelective(carMake)>0?R.ok():R.error();
    }

    @PutMapping("/sys/model/update")
    public R updateCarModel(@RequestBody CarModel carMake){
        return  carModelService.updateByPrimaryKeySelective(carMake)>0?R.ok():R.error();
    }

    @GetMapping("/sys/model/typeall")
    public R allTyoe(){
        final List<CarMake> all = carMakeService.findAll();
        return R.ok("sites",all);
    }
}
