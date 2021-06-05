package com.chen.blogboot.service;


import com.chen.blogboot.entity.FriendLink;

import java.util.List;

public interface FriendLinkService {
    /**
     * 获取前端需要的友链数据
     * @return
     */
    public List<FriendLink> getFriendLink();
}
