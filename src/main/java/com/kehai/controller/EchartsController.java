package com.kehai.controller;

import com.kehai.service.TagService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/echarts")
public class EchartsController {
    @Autowired
    private TagService service;

    @GetMapping("line")
    public R line(){
        return service.getLine();
    }

    @GetMapping("bar")
    public R bar(){
        return service.getBar();
    }

    @GetMapping("pie")
    public R pie(){
        return service.getPie();
    }
}
