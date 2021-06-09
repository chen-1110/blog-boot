package com.chen.blogboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private String articleCover;
    private String articleTitle;
    private Date createTime;
    private String categoryName;
    private String categoryId;
    private String id;
}
