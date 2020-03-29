package com.kehai.controller;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarMake;
import com.kehai.pojo.CarManufacturer;
import com.kehai.service.CarMakeService;
import com.kehai.service.CarManufacturerService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarManufacturerController {

    @Autowired
    private CarManufacturerService carManufacturerService;

    @Autowired
    private CarMakeService carMakeService;


    @GetMapping("/sys/manufacturer/list")
    public DataGridResult carMakeList(QueryDTO queryDTO){
        return  carManufacturerService.listByPage(queryDTO);
    }

    @DeleteMapping("/sys/manufacturer/del")
    public R deletesByIds(@RequestBody List<Long> ids){
        return   carManufacturerService.deletesByIds(ids);
    }

    @GetMapping("/sys/manufacturer/info/{id}")
    public R carMakeInfo(@PathVariable("id") Long id){
        return R.ok("manufacturer", carManufacturerService.selectByPrimaryKey(id)) ;
    }

    @PutMapping("/sys/manufacturer/save")
    public R saveCarManufacturer(@RequestBody CarManufacturer carMake){
        return  carManufacturerService.insertSelective(carMake)>0?R.ok():R.error();
    }

    @PutMapping("/sys/manufacturer/update")
    public R updateCarManufacturer(@RequestBody CarManufacturer carMake){
        return  carManufacturerService.updateByPrimaryKeySelective(carMake)>0?R.ok():R.error();
    }

    @GetMapping("/sys/manufacturer/typeall")
    public R allTyoe(){
        final List<CarMake> all = carMakeService.findAll();
        return R.ok("sites",all);
    }
}
