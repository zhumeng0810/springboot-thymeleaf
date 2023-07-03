package com.example.demo.dao;


import com.example.demo.pojo.Student;
import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper  // 告诉springboot这是一个mybatis的mapepr类
@Repository   // 将userdao交由spring容器管理
public interface StudentDao {

    // 根据用户名来查询用户  并分页展示
    public List<Student> listStuByName(UserQuery userQuery);


}

