package com.chen.blogboot.service;

import com.chen.blogboot.entity.Message;

import java.util.List;

public interface MessageService {
    /**
     * 获取所有留言
     * @return
     */
    public List<Message> getMessage();

    /**
     * 发表一条留言
     * @return
     */
    public void postMessage(String message);
}
