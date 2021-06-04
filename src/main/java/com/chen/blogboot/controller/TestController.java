package com.chen.blogboot.controller;

import com.chen.blogboot.entity.Department;
import com.chen.blogboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    /**
     * 按名称查询部门（这只是一个测试）
     */
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/department/{name}")
    @ResponseBody
    public Department getDepartmentByName(@PathVariable("name") String departmentName){
        Department departmentByName = departmentService.getDepartmentByName(departmentName);
        System.out.println(departmentByName);
        return departmentByName;
    }
}
