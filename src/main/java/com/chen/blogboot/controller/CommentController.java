package com.chen.blogboot.controller;

import com.chen.blogboot.common.lang.Result;
import com.chen.blogboot.dto.RealCommentDto;
import com.chen.blogboot.entity.Comment;
import com.chen.blogboot.mapper.CommentMapper;
import com.chen.blogboot.service.CommentService;
import com.chen.blogboot.utils.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CommentController {
    @Autowired
    CommentService commentService;
    @ResponseBody
    @GetMapping("/comments")
    public Result getComment(@RequestParam("current") String current, @RequestParam("articleId") String articleId){
        RealCommentDto realCommentDto = commentService.getComment(current, articleId);
        return Result.successful(realCommentDto);
    }
    @ResponseBody
    @PostMapping("/comments")
    public Result postComment(@RequestBody Comment comment, HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest){
        String cookieView = CookieUtils.getCookie(httpServletRequest, httpServletResponse);
        comment.setUserId(cookieView);
        commentService.postComment(comment);
        return Result.successful(null);
    }
}
