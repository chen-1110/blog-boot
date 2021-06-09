package com.chen.blogboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArchiveDto {
    private Date createTime;
    private String articleTitle;
    private String id;
}
