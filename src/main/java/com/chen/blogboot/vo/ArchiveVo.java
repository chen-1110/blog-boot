package com.chen.blogboot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArchiveVo {
    private Date createTime;
    private String articleTitle;
}
