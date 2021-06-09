package com.chen.blogboot.service.impl;

import com.chen.blogboot.dto.CommentDto;
import com.chen.blogboot.dto.RealCommentDto;
import com.chen.blogboot.entity.Comment;
import com.chen.blogboot.mapper.CommentMapper;
import com.chen.blogboot.service.CommentService;
import com.chen.blogboot.utils.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;
    @Override
    public RealCommentDto getComment(String current, String articleId) {
        int commentCount = commentMapper.getCommentCount(articleId);
        int head=Integer.parseInt(current)*10;
        int tail=(Integer.parseInt(current)+1)*10;
        if (commentCount<head){
            return null;
        }else if (commentCount<tail){
            tail=commentCount;
        }
        List<Comment> commentByArticleId = commentMapper.getCommentByArticleId(head, tail, articleId);
        RealCommentDto realCommentDto = new RealCommentDto();
        realCommentDto.setCount(commentCount);
        ArrayList<CommentDto> commentDtos = new ArrayList<>();
        CommentDto commentDto=null;
        for (Comment comment : commentByArticleId) {
            commentDto = new CommentDto();
            commentDto.setId(comment.getId());
            commentDto.setAvatar(comment.getAvatar());
            commentDto.setWebSite(comment.getWebSite());
            commentDto.setNickname(comment.getNickname());
            commentDto.setCreateTime(comment.getCreateTime());
            commentDto.setLikeCount(comment.getLikeCount());
            commentDto.setCommentContent(comment.getCommentContent());
            commentDto.setReplyId(comment.getReplyId());
            commentDto.setArticleId(comment.getArticleId());
            commentDto.setUserId(comment.getUserId());
            commentDto.setReplyCount(comment.getReplyCount());
            commentDto.setReplyDtoList(commentMapper.getCommentByReplyId(comment.getReplyId()));
            commentDtos.add(commentDto);
        }
        realCommentDto.setRecordList(commentDtos);
        return realCommentDto;
    }

    @Override
    public void postComment(Comment comment) {
        int id = commentMapper.getCommentCount(comment.getArticleId());
        comment.setId(String.valueOf(id));
        comment.setAvatar("");
        comment.setCreateTime(new Date());
        comment.setReplyId("0");
        comment.setReplyCount("0");
        comment.setLikeCount("0");
        commentMapper.postComment(comment);
    }
}
