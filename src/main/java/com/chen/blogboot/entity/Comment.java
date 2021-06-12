package com.chen.blogboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private String id;
    private String avatar;
    private String webSite;
    private String nickname;
    private Date createTime;
    private String commentContent;
    private String parentId;
    private String replyId;
    private String userId;
    private String articleId;
    private int replyCount;
    private int likeCount;
}
