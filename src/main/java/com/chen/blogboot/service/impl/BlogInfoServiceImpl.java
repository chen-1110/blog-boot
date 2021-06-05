package com.chen.blogboot.service.impl;

import com.chen.blogboot.entity.BlogInfo;
import com.chen.blogboot.mapper.BlogInfoMapper;
import com.chen.blogboot.service.BlogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogInfoServiceImpl implements BlogInfoService {
    @Autowired
    private BlogInfoMapper blogInfoMapper;
    @Override
    public BlogInfo getBlogInfo() {
        return blogInfoMapper.getBlogInfo();
    }
}
