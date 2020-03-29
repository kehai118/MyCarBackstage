package com.kehai.controller;

import com.kehai.dto.ActivityDTO;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Activity;
import com.kehai.service.ActivityService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/sys/activity")
public class ActivityController {

    @Autowired
    ActivityService activityService;


    @GetMapping("/list")
    public DataGridResult ActivityList(QueryDTO queryDTO){
        return  activityService.listByPage(queryDTO);
    }

    @DeleteMapping("/del")
    public R deletesByIds(@RequestBody List<Long> ids){
        return   activityService.deletesByIds(ids);
    }

    @GetMapping("/info/{id}")
    public R ActivityInfo(@PathVariable("id") Long id){
        return R.ok("activity",activityService.exchangeDto(activityService.selectByPrimaryKey(id))) ;
    }

    @PutMapping("/save")
    public R saveActivity(@RequestBody ActivityDTO dto){
        return  activityService.insertSelective(activityService.explainDto(dto))>0?R.ok():R.error();
    }

    @PutMapping("/update")
    public R updateActivity(@RequestBody ActivityDTO dto){
        return  activityService.updateByPrimaryKeySelective(activityService.explainDto(dto))>0?R.ok():R.error();
    }
}
