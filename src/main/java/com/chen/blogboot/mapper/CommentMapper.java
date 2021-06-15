package com.chen.blogboot.mapper;

import com.chen.blogboot.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
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
     * 获取特定replyId号w为提供的id的所有comment
     * @param id
     * @return
     */
    public List<Comment> getCommentByReplyId(String id);

    /**
     * 获取特定articleId共有多少条评论数据
     * @param articleId
     * @return
     */
    public int getCommentCount(String articleId);

    /**
     * 插入一条comment
     */
    public void postComment(String id, String avatar, String webSite, String nickname, Date createTime,String commentContent,String replyId,String userId,String articleId,int replyCount,int likeCount);

    /**
     * 获取comment表里面的数据的总数量
     * @return
     */
    public int getTotalCount();

    /**
     * 通过id号增加点赞数
     * @param id
     */
    public void postCommentLike(String id);

}
