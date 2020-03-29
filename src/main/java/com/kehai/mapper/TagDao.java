package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Tag;
import com.kehai.pojo.TagExample;
import java.util.List;

import com.kehai.util.R;
import org.apache.ibatis.annotations.Param;

public interface TagDao extends TopDao<Tag,TagExample>{
    List<Tag> findList(QueryDTO queryDTO);

    int deletesTag(List<Long> ids);
}