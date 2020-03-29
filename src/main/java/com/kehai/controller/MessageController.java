package com.kehai.controller;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Message;
import com.kehai.service.MessageService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys/message")
public class MessageController {
    @Autowired
    MessageService messageService;


    @GetMapping("/list")
    public DataGridResult ActivityList(QueryDTO queryDTO){
        return  messageService.listByPage(queryDTO);
    }

    @DeleteMapping("/del")
    public R deletesByIds(@RequestBody List<Long> ids){
        return   messageService.deletesByIds(ids);
    }

    @GetMapping("/info/{id}")
    public R ActivityInfo(@PathVariable("id") Long id){
        return R.ok("message", messageService.selectByPrimaryKey(id)) ;
    }

    @PutMapping("/save")
    public R saveActivity(@RequestBody Message message){
        return  messageService.insertSelective(message)>0?R.ok():R.error();
    }

    @PutMapping("/update")
    public R updateActivity(@RequestBody Message activity){
        return  messageService.updateByPrimaryKeySelective(activity)>0?R.ok():R.error();
    }
}
