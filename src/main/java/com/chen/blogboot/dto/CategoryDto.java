package com.chen.blogboot.dto;

import com.chen.blogboot.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private String name;
    private List<Category> articlePreviewDTOList;
}
