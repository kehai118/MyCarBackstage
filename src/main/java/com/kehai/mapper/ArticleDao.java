package com.kehai.mapper;

import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Article;
import com.kehai.pojo.ArticleExample;
import java.util.List;

import com.kehai.util.R;
import org.apache.ibatis.annotations.Param;

public interface ArticleDao  extends TopDao<Article,ArticleExample>{
    List<Article> tagList(QueryDTO queryDTO);

    int deletesByIds(List<Long> ids);
}