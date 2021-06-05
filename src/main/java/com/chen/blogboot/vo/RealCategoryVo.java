package com.chen.blogboot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealCategoryVo {
    private int count;
    private List<Object> recordList;
}
