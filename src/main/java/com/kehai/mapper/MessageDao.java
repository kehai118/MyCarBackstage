package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Message;
import com.kehai.pojo.MessageExample;
import java.util.List;

import com.kehai.util.R;

public interface MessageDao extends TopDao<Message,MessageExample> {

    List<Message> listByPage(QueryDTO queryDTO);

    int deletesByIds(List<Long> ids);
}