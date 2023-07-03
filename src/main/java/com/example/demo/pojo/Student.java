package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*
*
* 加了@Data注解的类，编译后会自动给我们加上下列方法：
    所有属性的get和set方法
    toString 方法
    hashCode方法
    equals方法
*
* @AllArgsConstructor ：有参构造方法
* @NoArgsConstructor ：无参构造方法
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private Integer id;
    private String name;
    private String age;
    private String xuehao;
}
