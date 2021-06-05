package com.chen.blogboot.service;

import com.chen.blogboot.entity.BlogInfo;
import org.springframework.stereotype.Service;


public interface BlogInfoService {
    /**
     * 获取blogInfo数据
     * @return
     */
    public BlogInfo getBlogInfo();
}
