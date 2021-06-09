package com.chen.blogboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RealCommentDto {
    private int count;
    private List<CommentDto> recordList;
}
