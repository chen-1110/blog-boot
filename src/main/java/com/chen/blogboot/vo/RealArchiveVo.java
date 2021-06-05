package com.chen.blogboot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RealArchiveVo {
    private int count;
    private List<ArchiveVo> recordList;
}
