package com.chen.blogboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FriendLink {
    private String linkAvatar;
    private String linkName;
    private String linkIntro;
}
