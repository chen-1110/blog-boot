package com.chen.blogboot.mapper;

import com.chen.blogboot.entity.BlogInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BlogInfoMapper {
    /**
     * 获得BlogInfo数据
     * @return
     */
    public BlogInfo getBlogInfo();

}
