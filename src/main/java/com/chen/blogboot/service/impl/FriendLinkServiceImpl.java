package com.chen.blogboot.service.impl;

import com.chen.blogboot.entity.FriendLink;
import com.chen.blogboot.mapper.FriendMapper;
import com.chen.blogboot.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendLinkServiceImpl implements FriendLinkService {
    @Autowired
    private FriendMapper friendMapper;
    @Override
    public List<FriendLink> getFriendLink() {
        return friendMapper.getFriends();
    }
}
