package com.kehai.controller;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Car;
import com.kehai.pojo.CarMake;
import com.kehai.service.CarMakeService;
import com.kehai.service.CarService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys/car")
public class CarController {
    @Autowired
    CarService carService;
    
    @Autowired
    private CarMakeService makeService;


    @GetMapping("/list")
    public DataGridResult carMakeList(QueryDTO queryDTO){
        return  carService.listByPage(queryDTO);
    }

    @DeleteMapping("/del")
    public R deletesByIds(@RequestBody List<Long> ids){
        return   carService.deletesByIds(ids);
    }

    @GetMapping("/info/{id}")
    public R carMakeInfo(@PathVariable("id") Long id){
        return R.ok("car", carService.selectByPrimaryKey(id)) ;
    }

    @PutMapping("/save")
    public R saveCarModel(@RequestBody Car carMake){
        return  carService.insertSelective(carMake)>0?R.ok():R.error();
    }

    @PutMapping("/update")
    public R updateCarModel(@RequestBody Car carMake){
        return  carService.updateByPrimaryKeySelective(carMake)>0?R.ok():R.error();
    }

    @GetMapping("/typeall")
    public R allTyoe(){
        final List<CarMake> all = makeService.findAll();
        return R.ok("sites",all);
    }
}
