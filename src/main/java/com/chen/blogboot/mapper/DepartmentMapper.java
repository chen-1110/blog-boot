package com.chen.blogboot.mapper;

import com.chen.blogboot.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DepartmentMapper {
    /**
     * 测试
     * @param departmentName
     * @return
     */
    public Department getDepartment(String departmentName);

}
