package com.chen.blogboot.controller;

import com.chen.blogboot.common.lang.Result;
import com.chen.blogboot.entity.Category;
import com.chen.blogboot.service.ArticleService;
import com.chen.blogboot.dto.CategoryDto;
import com.chen.blogboot.dto.RealCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class CategoryController {
    @Autowired
    private ArticleService articleService;
    @ResponseBody
    @GetMapping("/categories")
    public Result getCategories(){
        RealCategoryDto realCategory = articleService.getCategories();
        if (realCategory!=null){
            return Result.successful(realCategory);
        }else {
            return Result.fail("错误");
        }
    }

    @ResponseBody
    @GetMapping("/categories/{id}")
    public Result getCategory(@PathVariable("id") String id, @RequestParam("current") String current){
        CategoryDto categoryDto = articleService.getCategory(id, current);
        if (categoryDto !=null){
            return Result.successful(categoryDto);
        }else {
            CategoryDto vo = new CategoryDto("0", new ArrayList<Category>());
            return Result.successful(vo);
        }
    }
}
