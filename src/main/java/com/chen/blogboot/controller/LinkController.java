package com.chen.blogboot.controller;

import com.chen.blogboot.common.lang.Result;
import com.chen.blogboot.entity.FriendLink;
import com.chen.blogboot.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LinkController {
    @Autowired
    private FriendLinkService friendLinkService;
    @ResponseBody
    @GetMapping("/links")
    public Result getFriendLink(){
        List<FriendLink> list = friendLinkService.getFriendLink();
        if (list!=null){
            return Result.successful(list);
        }else {
            return Result.fail("错误");
        }
    }
}
