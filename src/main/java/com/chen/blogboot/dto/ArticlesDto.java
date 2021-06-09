package com.chen.blogboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticlesDto {
    private String id;
    private String articleCover;
    private String articleTitle;
    private String isTop;
    private Date createDate;
    private String categoryName;
    private String articleContent;
    private String categoryId;
}
