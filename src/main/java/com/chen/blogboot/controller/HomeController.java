package com.chen.blogboot.controller;

import com.chen.blogboot.common.lang.Result;
import com.chen.blogboot.entity.Article;
import com.chen.blogboot.entity.BlogInfo;
import com.chen.blogboot.service.ArticleService;
import com.chen.blogboot.service.BlogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    private BlogInfoService blogInfoService;
    @Autowired
    private ArticleService articleService;
    @GetMapping("/")
    @ResponseBody
    public Result getBlogInfo(){
        BlogInfo blogInfo=blogInfoService.getBlogInfo();
        if(blogInfo!=null){
            return Result.successful(blogInfoService.getBlogInfo());
        }else {
            return Result.fail("错误");
        }
    }
    @GetMapping("/articles")
    @ResponseBody
    public Result getArticles(@RequestParam("current") String current){
        Object result=articleService.getArticles(current);
        if (result!=null){
            result=Result.successful((List<Article>)result);
        }else {
            result=Result.fail("错误");
        }
        return (Result) result;
    }

}
