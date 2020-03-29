package com.kehai.service;

import com.kehai.dto.ArticleDTO;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Article;
import com.kehai.util.R;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ArticleService extends TopService<Article,ArithmeticException> {
    Article explainDTO(ArticleDTO articleDTO);
    DataGridResult articleList(QueryDTO queryDTO);
    @Transactional(propagation = Propagation.REQUIRED)
    R deletesById(List<Long> ids);
}
