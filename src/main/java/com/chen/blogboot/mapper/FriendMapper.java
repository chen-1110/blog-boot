package com.chen.blogboot.mapper;

import com.chen.blogboot.entity.FriendLink;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FriendMapper {
    /**
     * 获取友链数据
      * @return
     */
    public List<FriendLink> getFriends();

    /**
     * 获取友链数据的条数
     * @return
     */
    public int getFriendsCount();
}
