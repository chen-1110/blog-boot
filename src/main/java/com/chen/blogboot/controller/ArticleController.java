package com.chen.blogboot.controller;

import com.chen.blogboot.common.lang.Result;
import com.chen.blogboot.service.ArticleService;
import com.chen.blogboot.dto.ArticleDto;
import com.chen.blogboot.dto.NewArticleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @ResponseBody
    @GetMapping("/articles/{id}")
    public Result getArticle(@PathVariable("id") String id){
        ArticleDto articleDto = articleService.getArticle(id);
        if(articleDto !=null){
            return Result.successful(articleDto);
        }else {
            return Result.fail("错误");
        }
    }
    @ResponseBody
    @GetMapping("/articles/newest")
    public Result getNewArticle(){
        List<NewArticleDto> newArticle = articleService.getNewArticle();
        if (newArticle!=null){
            return Result.successful(newArticle);
        }else {
            return Result.fail("错误");
        }
    }
}
