package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.ActivityDTO;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.ActivityDao;
import com.kehai.mapper.TopDao;
import com.kehai.pojo.Activity;
import com.kehai.pojo.ActivityWithBLOBs;
import com.kehai.pojo.ProductWithBLOBs;
import com.kehai.service.ActivityService;
import com.kehai.util.R;
import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    ActivityDao dao;

    @Override
    public TopDao getDao() {
        return dao;
    }

    @Override
    public DataGridResult listByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());

        if (queryDTO.getSort()==null || queryDTO.getSort().equals("")){
            queryDTO.setSort("id");
        }

        final List<ActivityWithBLOBs> makes = dao.listByPage(queryDTO);

        final List<ActivityDTO> collect = makes.stream().map(this::exchangeDto).collect(Collectors.toList());

        final PageInfo<ActivityDTO> info = new PageInfo<>(collect);
        return new DataGridResult(info.getTotal(),info.getList());
    }

    @Override
    public ActivityWithBLOBs selectByPrimaryKey(Long id) {
        return (ActivityWithBLOBs) dao.selectByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ActivityWithBLOBs record) {
        return dao.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(ActivityWithBLOBs record) {
        return dao.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public R deletesByIds(List<Long> ids) {
        return dao.deletesByIds(ids)>0?R.ok():R.error();
    }

    @Override
    public ActivityWithBLOBs explainDto(ActivityDTO dto) {
        final ActivityWithBLOBs activity = new ActivityWithBLOBs();
        BeanUtils.copyProperties(dto,activity);
        final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            if (dto.getBeginTime() != null) activity.setBeginTime(format.parse(dto.getBeginTime()).getTime());
            if (dto.getEndTime() != null) activity.setEndTime(format.parse(dto.getEndTime()).getTime());
            if (dto.getCreateTime() != null) activity.setCreateTime(format.parse(dto.getCreateTime()).getTime());
            if (dto.getUnpublishTime() != null) activity.setUnpublishTime(format.parse(dto.getUnpublishTime()).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return activity;
    }

    @Override
    public ActivityDTO exchangeDto(ActivityWithBLOBs e) {
        final ActivityDTO dto = new ActivityDTO();
        BeanUtils.copyProperties(e, dto);
        final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        if (e.getBeginTime() != null) dto.setBeginTime(format.format(e.getBeginTime()));
        if (e.getEndTime() != null) dto.setEndTime(format.format(e.getEndTime()));
        if (e.getCreateTime() != null) dto.setCreateTime(format.format(e.getCreateTime()));
        if (e.getUnpublishTime() != null) dto.setUnpublishTime(format.format(e.getUnpublishTime()));
        return dto;
    }
}
