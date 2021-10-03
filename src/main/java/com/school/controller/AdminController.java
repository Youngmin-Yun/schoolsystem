package com.school.controller;

import java.util.List;

import com.school.mapper.AdminMapper;
import com.school.mapper.RegistStudent;
import com.school.mapper.RegistTeacher;
import com.school.mapper.SubjectMapper;
import com.school.service.AdminService;
import com.school.vo.AdminVO;
import com.school.vo.SubjectVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminController {
    @Autowired
    RegistTeacher t_mapper;
    @Autowired
    RegistStudent s_mapper;
    @Autowired
    AdminMapper a_mapper;
    @Autowired
    SubjectMapper sub_mapper;
    @Autowired
    AdminService service;
    @GetMapping("/admin")
    public String admin(Model model){
        List<AdminVO> e_list = a_mapper.eventList();
        model.addAttribute("e_list", e_list);
        return "/admin";
    }
    @GetMapping("/admin/teacher/list")
    public String teacherList(Model model){
        List<AdminVO> t_list = t_mapper.allTeacher();
        model.addAttribute("t_list", t_list);    
        return "/admin/teacherlist";
    }
    @GetMapping("/admin/student/list")
    public String studentList(Model model){
        List<AdminVO> s_list = s_mapper.allStudent();
        model.addAttribute("s_list", s_list);   
        return "/admin/studentlist";
    }
    @GetMapping("/admin/subject/list")
    public String subjectList(Model model){
        List<SubjectVO> sub_list = sub_mapper.allSubject();
        model.addAttribute("list", sub_list);
        return "/admin/add_subject";
    }
    @GetMapping("/admin/info")
    public String myInfo(){
        return "/admin/myinfo";
    }
    @GetMapping("/admin/info/change")
    public String myInfoChange(){
        return "/admin/change";
    }
}