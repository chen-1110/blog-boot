package com.chen.blogboot.controller;

import com.chen.blogboot.common.lang.Result;
import com.chen.blogboot.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutController {
    @Autowired
    private AboutService aboutService;
    @ResponseBody
    @GetMapping("/about")
    public Result getAboutMessage(){
        String aboutMessage = aboutService.getAboutMessage();
        if (aboutMessage!=null){
            return Result.successful(aboutMessage);
        }else {
            return Result.fail("错误");
        }
    }
}
