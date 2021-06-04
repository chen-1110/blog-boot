package com.chen.blogboot.service.impl;

import com.chen.blogboot.entity.Department;
import com.chen.blogboot.mapper.DepartmentMapper;
import com.chen.blogboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    public Department getDepartmentByName(String departmentName){
        return departmentMapper.getDepartment(departmentName);
    }
}
