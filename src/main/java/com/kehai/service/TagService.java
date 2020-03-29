package com.kehai.service;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Tag;
import com.kehai.pojo.TagExample;
import com.kehai.util.R;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TagService extends TopService<Tag, TagExample> {
    @Transactional(propagation = Propagation.REQUIRED)
    R deletesTag(List<Long> ids);
    DataGridResult tagList(QueryDTO queryDTO);

    R getLine();
    R getBar();
    R getPie();
}
