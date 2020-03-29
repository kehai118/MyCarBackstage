package com.kehai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kehai.dto.ArticleDTO;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.mapper.ArticleDao;
import com.kehai.mapper.TopDao;
import com.kehai.pojo.Article;
import com.kehai.service.ArticleService;
import com.kehai.util.R;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Override
    public Article explainDTO(ArticleDTO articleDTO)  {
        final Article article = new Article();
        BeanUtils.copyProperties(articleDTO,article);

        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        if(articleDTO.getCrateTime()!=null) {
            try {
                final long time = dateFormat.parse(articleDTO.getCrateTime()).getTime();
                article.setCreateTime(time);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else {
            article.setCreateTime(new Date().getTime());
        }

        article.setAllowUp((byte)((articleDTO.getAllowUp()!=null && articleDTO.getAllowUp())?1:0));
        article.setAllowFav((byte)((articleDTO.getAllowFav()!=null && articleDTO.getAllowFav())?1:0));


        return article;
    }

    @Override
    public DataGridResult articleList(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());

        if(queryDTO.getSort()==null || queryDTO.getSort().equals("")){
            queryDTO.setSort("id");
        }

        List<Article>  articles= articleDao.tagList(queryDTO);

        final List<ArticleDTO> collect = articles.stream().map(e -> {
            final ArticleDTO dto = new ArticleDTO();
            BeanUtils.copyProperties(e, dto);
            if(e.getCreateTime()!=null)
                dto.setCrateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(e.getCreateTime())));
            return dto;
        }).collect(Collectors.toList());


        PageInfo<ArticleDTO> info=new PageInfo<>(collect);

        return new DataGridResult(info.getTotal(),info.getList());
    }

    @Override
    public R deletesById(List<Long> ids){
        return articleDao.deletesByIds(ids)>0?R.ok():R.error("未知错误");
    }

    @Override
    public TopDao getDao() {
        return articleDao;
    }
}
