package com.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistController {
    @GetMapping("/regist/student")
    public String registStudent(){
        return "/regist/regist_student";
    }
    @GetMapping("/regist/teacher")
    public String registTeacher(){
        return "/regist/regist_teacher";
    }
    @GetMapping("/regist/admin")
    public String registAdmin(){
        return "/regist/regist_admin";
    }
}