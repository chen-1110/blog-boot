package com.chen.blogboot.mapper;

import com.chen.blogboot.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentMapper {
    /**
     * 获取特定articleId号的所有comment
     * @param head
     * @param tail
     * @param articleId
     * @return
     */
    public List<Comment> getCommentByArticleId(int head,int tail,String articleId);

    /**
     * 获取特定replyId号的所有comment
     * @param ReplyId
     * @return
     */
    public List<Comment> getCommentByReplyId(String ReplyId);

    /**
     * 获取特定articleId共有多少条评论数据
     * @param articleId
     * @return
     */
    public int getCommentCount(String articleId);

    /**
     * 插入一条comment
     */
    public void postComment(Comment comment);
}
