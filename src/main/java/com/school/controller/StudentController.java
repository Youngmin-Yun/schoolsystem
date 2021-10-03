package com.school.controller;

import java.util.List;

import com.school.service.StudentService;
import com.school.vo.AdminVO;
import com.school.vo.NoticeClassVO;
import com.school.vo.RegistStudentVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping("/student")
    public String studentClass(Model model){   
        return "/Student";
    }
    @GetMapping("/student/{grade}/{room}")
    public String selectClassMate(Model model, @PathVariable Integer grade, @PathVariable Integer room){
        List<RegistStudentVO> list = service.selectClass(grade, room);
        model.addAttribute("list", list);
        return "/student/class";
    }
    @GetMapping("/student/classNotice/{grade}/{room}")
    public String classNotice(Model model, @PathVariable Integer room, @PathVariable Integer grade){
        List<NoticeClassVO> classEvent = service.classEvent(room, grade);
        model.addAttribute("classEvent", classEvent);
        List<AdminVO> eventList = service.eventList();
        model.addAttribute("eventList", eventList);
        return "/student/studentNotice";
    }
    @GetMapping("/student/info/change")
    public String changeStudentInfo(){
        return "/student/change";
    }
}
