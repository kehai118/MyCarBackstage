package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.TagDao;
import com.kehai.mapper.TopDao;
import com.kehai.pojo.Tag;
import com.kehai.service.TagService;
import com.kehai.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagDao dao;

    @Override
    public TopDao getDao() {
        return dao;
    }

    @Override
    public R deletesTag(List<Long> ids) {
        return dao.deletesTag(ids)>0?R.ok():R.error("未知原因，删除失败");
    }

    @Override
    public DataGridResult tagList(@RequestBody QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());

        if (queryDTO.getSort()==null || queryDTO.getSort().equals("")) {
            queryDTO.setSort("id");
        }

        List<Tag> tags=dao.findList(queryDTO);

        PageInfo<Tag> info=new PageInfo<>(tags);

        final DataGridResult dataGridResult = new DataGridResult(info.getTotal(), info.getList());
        return dataGridResult;
    }

    @Override
    public R getLine() {
        final List<Tag> all = findAll();
        final List<String> xAxis = all.stream().map(Tag::getName).collect(Collectors.toList());
        final List<Long> seriesData = all.stream().map(Tag::getClickCount).collect(Collectors.toList());
        final R r = new R();
        r.put("xAxis",xAxis);
        r.put("seriesData",seriesData);
        return r;
    }

    @Override
    public R getBar() {
        final List<Tag> all = findAll();
        final List<String> xAxis = all.stream().map(Tag::getName).collect(Collectors.toList());
        final List<Long> seriesData = all.stream().map(Tag::getClickCount).collect(Collectors.toList());
        final R r = new R();
        r.put("xAxis",xAxis);
        r.put("seriesData",seriesData);
        return r;
    }

    @Override
    public R getPie() {
        final List<Tag> all = findAll();
        final List<String> legendData = all.stream().map(Tag::getName).collect(Collectors.toList());
        final List<HashMap<String, Object>> collect = all.stream().map(e -> {
            final HashMap<String, Object> map = new HashMap<>();
            map.put("name", e.getName());
            map.put("value", e.getClickCount());
            return map;
        }).collect(Collectors.toList());
       // final List<Long> seriesData = all.stream().map(Tag::getClickCount).collect(Collectors.toList());
        final R r = new R();
        r.put("legendData",legendData);
        r.put("seriesData",collect);
        return r;
    }
}
