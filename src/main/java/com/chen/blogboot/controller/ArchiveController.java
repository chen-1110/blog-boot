package com.chen.blogboot.controller;
import com.chen.blogboot.common.lang.Result;
import com.chen.blogboot.service.ArticleService;
import com.chen.blogboot.vo.ArchiveVo;
import com.chen.blogboot.vo.RealArchiveVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ArchiveController {
    @Autowired
    private ArticleService articleService;
    @GetMapping("/articles/archives")
    @ResponseBody
    public Result getArchives(@RequestParam("current") String current){
        RealArchiveVo realArchiveVo = articleService.getArchives(current);
        if (realArchiveVo!=null){
            return Result.successful(realArchiveVo);
        }else {
            return Result.fail("错误");
        }
    }
}
