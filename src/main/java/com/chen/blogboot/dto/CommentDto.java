package com.chen.blogboot.dto;

import com.chen.blogboot.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private String id;
    private String avatar;
    private String webSite;
    private String nickname;
    private Date createTime;
    private int likeCount;
    private String commentContent;
    private String parentId;
    private String replyId;
    private String userId;
    private String articleId;
    private int replyCount;
    private List<Comment> replyDTOList;
}
