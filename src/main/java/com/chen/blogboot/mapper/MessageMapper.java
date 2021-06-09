package com.chen.blogboot.mapper;

import com.chen.blogboot.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MessageMapper {
    /**
     * 获取所有留言
     * @return
     */
    public List<Message> getMessage();

    /**
     * 发表一条留言
     */
    public void postMessage(String message);
}
