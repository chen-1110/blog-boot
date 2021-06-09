package com.chen.blogboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriesDto {
    private String categoryName;
    private int articleCount;
    private String Id;
}
