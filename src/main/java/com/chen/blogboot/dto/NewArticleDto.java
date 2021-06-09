package com.chen.blogboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewArticleDto {
    private String id;
    private String articleCover;
    private Date createTime;
    private String articleTitle;
}
