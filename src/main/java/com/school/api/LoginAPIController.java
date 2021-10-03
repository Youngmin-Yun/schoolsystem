package com.school.api;

import java.util.Map;

import javax.servlet.http.HttpSession;

import com.school.service.LoginService;
import com.school.vo.LoginVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginAPIController {
    @Autowired
    LoginService service;
    @PostMapping("/school/login/teacher")
    public Map<String, Object> teacherLogin(@RequestBody LoginVO vo, HttpSession session){
        Map<String, Object> resultMap = service.loginteacher(vo);
        session.setAttribute("teacher", resultMap.get("teacher"));
        return resultMap;
    }
    @PostMapping("/school/login/admin")
    public Map<String, Object> adminLogin(@RequestBody LoginVO vo, HttpSession session){
        Map<String, Object> resultMap = service.loginAdmin(vo);
        session.setAttribute("admin", resultMap.get("admin"));
        return resultMap;
    }
    @PostMapping("/school/login/student")
    public Map<String, Object> studentLogin(@RequestBody LoginVO vo, HttpSession session){
        Map<String, Object> resultMap = service.loginStudent(vo);
        session.setAttribute("student", resultMap.get("student"));
        return resultMap;
    }
}
