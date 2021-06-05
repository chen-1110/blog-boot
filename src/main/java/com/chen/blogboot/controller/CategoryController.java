package com.chen.blogboot.controller;

import com.chen.blogboot.common.lang.Result;
import com.chen.blogboot.service.ArticleService;
import com.chen.blogboot.vo.CategoryVo;
import com.chen.blogboot.vo.RealCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CategoryController {
    @Autowired
    private ArticleService articleService;
    @ResponseBody
    @GetMapping("/categories")
    public Result getCategory(){
        RealCategoryVo realCategory = articleService.getCategory();
        if (realCategory!=null){
            return Result.successful(realCategory);
        }else {
            return Result.fail("错误");
        }
    }
}
