package com.kehai.controller;

import com.kehai.dto.ArticleDTO;
import com.kehai.dto.DataGridResult;
import com.kehai.dto.QueryDTO;
import com.kehai.pojo.Article;
import com.kehai.service.ArticleService;
import com.kehai.util.R;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/sys/article/list")
    public DataGridResult articleList(QueryDTO queryDTO){
        return articleService.articleList(queryDTO);
    }

   @DeleteMapping("/sys/article/del")
   public R deleteArticel(@RequestBody List<Long> ids){
        return articleService.deletesById(ids);
   }

   @GetMapping("/sys/article/info/{id}")
    public R infoArticle(@PathVariable("id") Long id){
       final Article article = articleService.selectByPrimaryKey(id);
       return R.ok("article",article);
   }

   @PutMapping("/sys/article/save")
    public R saveArticle(@RequestBody ArticleDTO articleDTO){
        return articleService.insertSelective(articleService.explainDTO(articleDTO))>0?R.ok():R.error("未知错误，请联系管理员");
   }

   @PutMapping("/sys/article/update")
    public R updateArtilce(@RequestBody ArticleDTO articleDTO){
        return articleService.updateByPrimaryKeySelective(articleService.explainDTO(articleDTO))>0?R.ok():R.error("未知错误，请联系管理员");
   }
}
