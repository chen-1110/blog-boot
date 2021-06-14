package com.chen.blogboot.controller;

import com.chen.blogboot.common.lang.Result;
import com.chen.blogboot.entity.Message;
import com.chen.blogboot.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@Controller
public class MessageController {
    @Autowired
    MessageMapper messageMapper;
    @ResponseBody
    @GetMapping("/messages")
    public Result getMessage(){
        List<Message> message = messageMapper.getMessage();
        if (!message.isEmpty()){
            return Result.successful(message);
        }else {
            return Result.fail("错误");
        }
    }
    @ResponseBody
    @PostMapping("/messages")
    public Result postMessage(@RequestBody Map<String,Object> message){
        System.out.println(message);
        Object messageContent = message.get("messageContent");
        messageMapper.postMessage((String) messageContent);
        return Result.successful(null);
    }
}
