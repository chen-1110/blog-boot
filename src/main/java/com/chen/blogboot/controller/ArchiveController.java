package com.chen.blogboot.controller;
import com.chen.blogboot.common.lang.Result;
import com.chen.blogboot.service.ArticleService;
import com.chen.blogboot.dto.RealArchiveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArchiveController {
    @Autowired
    private ArticleService articleService;
    @GetMapping("/articles/archives")
    @ResponseBody
    public Result getArchives(@RequestParam("current") String current){
        RealArchiveDto realArchiveDto = articleService.getArchives(current);
        if (realArchiveDto !=null){
            return Result.successful(realArchiveDto);
        }else {
            return Result.fail("错误");
        }
    }
}
