package com.chen.blogboot.service;

import com.chen.blogboot.dto.RealCommentDto;
import com.chen.blogboot.entity.Comment;

public interface CommentService {
    /**
     * 获取comment相关所有数据
     * @param current
     * @param articleId
     * @return
     */
    public RealCommentDto getComment(String current,String articleId);

    /**
     * 增加一条comment
     * @param comment
     */
    public void postComment(Comment comment);

    /**
     * 通过指定id号增加点赞数
     * @param id
     */
    public void postCommentLike(String id);
}
