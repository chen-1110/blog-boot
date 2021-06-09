package com.chen.blogboot.service.impl;

import com.chen.blogboot.entity.Message;
import com.chen.blogboot.mapper.MessageMapper;
import com.chen.blogboot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;
    @Override
    public List<Message> getMessage() {
        return messageMapper.getMessage();
    }

    @Override
    public void postMessage(String message) {
        messageMapper.postMessage(message);
    }
}
