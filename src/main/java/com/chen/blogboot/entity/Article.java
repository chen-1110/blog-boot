package com.chen.blogboot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private String id;
    private String articleCover;
    private String articleTitle;
    private String isTop;
    private Date createDate;
    private Date updateDate;
    private String categoryName;
    private String articleContent;
    private String categoryId;
    private int viewCount;
    private int likeCount;
    private String lastArticleId;
    private String nextArticleId;
}
