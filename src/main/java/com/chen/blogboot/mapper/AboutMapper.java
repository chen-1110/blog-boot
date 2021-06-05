package com.chen.blogboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AboutMapper {
    public String getAboutMessage();
}
