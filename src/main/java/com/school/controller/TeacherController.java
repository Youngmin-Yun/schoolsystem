package com.school.controller;

import java.util.List;

import com.school.mapper.LoginMapper;
import com.school.service.TeacherService;
import com.school.service.TestService;
import com.school.vo.AdminVO;
import com.school.vo.NoticeVO;
import com.school.vo.RegistStudentVO;
import com.school.vo.RegistTeacherVO;
import com.school.vo.SubjectVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TeacherController {
    @Autowired
    TeacherService service;
    @Autowired
    TestService t_service;
    @Autowired
    LoginMapper l_mapper;
    @GetMapping("/teacher")
    public String mainTeacher(Model model){
        List<AdminVO> eventList = service.eventList();
        List<NoticeVO> noticeList = service.noticeSchool();
        model.addAttribute("eventList", eventList);
        model.addAttribute("notice", noticeList);
        return "/teacher";
    }
    @GetMapping("/teacher/notice")
    public String noticeTeacher(){
        return "/teacher/notice_teacher";
    }

    // 로그인 완성 후 교사의 학년과 반을 가져와서 연결 할 수 있도록 해야함
    @GetMapping("/teacher/student/{grade}/{room}")
    public String selectClassMate(Model model, @PathVariable Integer grade, @PathVariable Integer room){
        List<RegistStudentVO> list = service.selectClass(grade, room);
        model.addAttribute("list", list);
        return "/teacher/teacher_class_student";
    }

    @GetMapping("/teacher/teacher_list")
    public String schoolTeacherList(Model model){
        List<RegistTeacherVO> t_list = service.schoolTeacher();
        model.addAttribute("list", t_list);
        return "teacher/teacherlist";
    }

    @GetMapping("/teacher/student_list")
    public String schoolStudentList(Model model){
        List<RegistStudentVO> s_list = service.allStudent();
        model.addAttribute("list", s_list);
        return "teacher/teacher_all_student";
    }
    @GetMapping("/teacher/assignment")
    public String checkAssignment(){
        return "/teacher/assignment_check";
    }
    @GetMapping("/teacher/test/{grade}/{room}")
    public String Score(Model model, @PathVariable Integer grade, @PathVariable Integer room){
        List<RegistStudentVO> list = service.selectClass(grade, room);
        model.addAttribute("list", list);
        return "/teacher/teacher_test_check";
    }
    @GetMapping("/teacher/test/score/{grade}/{room}")
    public String insertScore(Model model, @PathVariable Integer grade, @PathVariable Integer room){
        List<RegistStudentVO> list = service.selectClass(grade, room);
        model.addAttribute("list", list);
        List<SubjectVO> s_list = t_service.subjectList();
        model.addAttribute("s_list", s_list);
        return "/teacher/insert_score";
    }
    @GetMapping("/teacher/my_info")
    public String myInfo(){
        return "/teacher/my_info";
    }
    @GetMapping("/teacher/my_info/change")
    public String changeMyInfo(){
        return "/teacher/change";
    }
}
