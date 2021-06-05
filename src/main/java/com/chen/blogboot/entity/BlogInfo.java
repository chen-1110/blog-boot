package com.chen.blogboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogInfo {
    private String articleCount;
    private String categoryCount;
    private String notice;
    private String viewCount;
    private String avatar;
    private String intro;
    private String nickname;
}
