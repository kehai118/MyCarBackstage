package com.kehai.controller;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.CarMake;
import com.kehai.service.CarMakeService;
import com.kehai.util.R;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarMakeController {

    @Autowired
    private CarMakeService carMakeService;

    @GetMapping("/sys/make/list")
    public DataGridResult carMakeList(QueryDTO queryDTO){
        return  carMakeService.carMakeList(queryDTO);
    }

    @DeleteMapping("/sys/make/del")
    public R deletesByIds(@RequestBody List<Long> ids){
        return   carMakeService.deletesByIds(ids);
    }

    @GetMapping("/sys/make/info/{id}")
    public R carMakeInfo(@PathVariable("id") Long id){
        return R.ok("make",carMakeService.selectByPrimaryKey(id)) ;
    }

    @PutMapping("/sys/make/save")
    public R saveCarMake(@RequestBody CarMake carMake){
        return  carMakeService.insertSelective(carMake)>0?R.ok():R.error();
    }

    @PutMapping("/sys/make/update")
    public R updateCarMake(@RequestBody CarMake carMake){
        return  carMakeService.updateByPrimaryKeySelective(carMake)>0?R.ok():R.error();
    }
}
