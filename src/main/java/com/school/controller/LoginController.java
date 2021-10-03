package com.school.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login/teacher")
    public String getTeacherLogin(){
        return "/login/teacherLogin";
    }
    @GetMapping("/login/admin")
    public String getAdminLogin(){
        return "/login/adminLogin";
    }
    @GetMapping("/login/student")
    public String getStudentLogin(){
        return "/login/studentLogin";
    }
    @GetMapping("/logout/system")
    public String getLogout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
