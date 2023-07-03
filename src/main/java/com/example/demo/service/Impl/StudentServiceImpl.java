package com.example.demo.service.Impl;

import com.example.demo.dao.StudentDao;
import com.example.demo.dao.UserDao;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import com.example.demo.service.StudentService;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   //  交由spring容器管理
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDao stuDao;

    @Override
    public PageInfo<Student> listStuByName(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());
        return new PageInfo<Student>(stuDao.listStuByName(userQuery));
    }


}
