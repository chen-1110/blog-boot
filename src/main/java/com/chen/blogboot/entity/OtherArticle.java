package com.chen.blogboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherArticle {
    private String id;
    private String articleCover;
    private String articleTitle;
}
