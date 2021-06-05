package com.chen.blogboot.service.impl;

import com.chen.blogboot.mapper.AboutMapper;
import com.chen.blogboot.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutServiceImpl implements AboutService {
    @Autowired
    private AboutMapper aboutMapper;
    @Override
    public String getAboutMessage() {
        return aboutMapper.getAboutMessage();
    }
}
