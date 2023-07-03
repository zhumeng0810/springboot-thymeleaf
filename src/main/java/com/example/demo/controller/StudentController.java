package com.example.demo.controller;


import com.example.demo.pojo.Student;
import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import com.example.demo.service.StudentService;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class StudentController {
    @Autowired
    private StudentService stuService;

    @GetMapping("/stu")
    public String index(Model model, UserQuery userQuery) {
        PageInfo<Student> stuPageInfo = stuService.listStuByName(userQuery);
        model.addAttribute("page", stuPageInfo);
        return "stu";
    }



    @PostMapping("/stu")
    public String listStuByName(Model model, UserQuery userQuery) {
        PageInfo<Student> stuPageInfo = stuService.listStuByName(userQuery);
        model.addAttribute("page", stuPageInfo);
        return "stu";
    }


}
