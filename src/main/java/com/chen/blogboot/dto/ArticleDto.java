package com.chen.blogboot.dto;


import com.chen.blogboot.entity.OtherArticle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {
    private String articleCover;
    private String articleTitle;
    private Date createDate;
    private Date updateDate;
    private String categoryName;
    private String articleContent;
    private String categoryId;
    private String viewsCount;
    private String likeCount;
    private OtherArticle lastArticle;
    private OtherArticle nextArticle;
}
