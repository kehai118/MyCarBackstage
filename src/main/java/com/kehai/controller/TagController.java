package com.kehai.controller;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Tag;
import com.kehai.service.TagService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TagController {
    @Autowired
    private TagService tagService;

    @DeleteMapping("/sys/tag/del")
    public R deleteTag(@RequestBody List<Long> ids){
        final R r = tagService.deletesTag(ids);
        return r;
    }

    @GetMapping("/sys/tag/info/{id}")
    public R tagInfo(@PathVariable("id") Long id){
        final Tag tag = tagService.selectByPrimaryKey(id);
        return R.ok("tag",tag);
    }

    @PutMapping("/sys/tag/save")
    public R  saveTag(@RequestBody Tag tag){
        final int i = tagService.insertSelective(tag);
        return i>0?R.ok():R.error("系统错误，请联系管理员");
    }

    @PutMapping("/sys/tag/update")
    public R updateTag(@RequestBody Tag tag){
        final int i = tagService.updateByPrimaryKey(tag);
        return i>0?R.ok():R.error("系统错误，请联系管理员");
    }

    @GetMapping("/sys/tag/list")
    public DataGridResult tagList(QueryDTO queryDTO){
        final DataGridResult dataGridResult = tagService.tagList(queryDTO);
        return dataGridResult;
    }
}
