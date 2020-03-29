package com.kehai.service;

import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Message;
import com.kehai.pojo.MessageExample;
import com.kehai.util.R;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface MessageService extends TopService<Message, MessageExample> {
    DataGridResult listByPage(QueryDTO queryDTO);

    @Transactional(propagation = Propagation.REQUIRED)
    R deletesByIds(List<Long> ids);
}
