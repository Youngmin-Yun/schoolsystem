package com.school.service;

import java.util.LinkedHashMap;
import java.util.Map;

import com.school.mapper.LoginMapper;
import com.school.vo.AdminRegistVO;
import com.school.vo.LoginVO;
import com.school.vo.RegistStudentVO;
import com.school.vo.RegistTeacherVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    LoginMapper mapper;
    public Map<String, Object> loginteacher(LoginVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        Integer result = mapper.loginTeacher(vo);
        if(result == 1){
            resultMap.put("status", true);
            RegistTeacherVO teacher = mapper.selectTeacherById(vo.getId());
            resultMap.put("teacher", teacher);
        }
        else{
            resultMap.put("status", false);
            resultMap.put("message", "존재하지 않는 회원입니다.");
        }
        return resultMap;
    }
    public Map<String, Object> loginAdmin(LoginVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        Integer result = mapper.loginAdmin(vo);
        if(result == 1){
            resultMap.put("status", true);
            AdminRegistVO admin = mapper.selectAdminById(vo.getId());
            resultMap.put("admin", admin);
        }
        else{
            resultMap.put("status", false);
            resultMap.put("message", "존재하지 않는 회원입니다.");
        }
        return resultMap;
    }
    public Map<String, Object> loginStudent(LoginVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        Integer result = mapper.loginStudent(vo);
        if(result == 1){
            resultMap.put("status", true);
            RegistStudentVO student = mapper.selectStudentById(vo.getId());
            resultMap.put("student", student);
        }
        else{
            resultMap.put("status", false);
            resultMap.put("message", "존재하지 않는 회원입니다.");
        }
        return resultMap;
    }
}
