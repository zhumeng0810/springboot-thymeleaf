package com.example.demo.service;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface StudentService {


    // 根据用户名来查询学生  并分页展示
    public PageInfo<Student> listStuByName(UserQuery userQuery);


}
