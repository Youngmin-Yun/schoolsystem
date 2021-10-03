package com.school.api;

import java.util.LinkedHashMap;
import java.util.Map;

import com.school.service.RegistService;
import com.school.vo.AdminRegistVO;
import com.school.vo.RegistStudentVO;
import com.school.vo.RegistTeacherVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistAPIController {
    @Autowired
    RegistService service;
    @PostMapping("/regist/api/student")
    public Map<String, Object> addStudent(@RequestBody RegistStudentVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        boolean sr = service.registStudent(vo);
        if(sr){
            resultMap.put("result", "success");
            resultMap.put("message", "정상적으로 등록되었습니다.");
        }
        else{
            resultMap.put("result", "failed");
            resultMap.put("message", "정상적으로 등록되지 않았습니다.");
        }
        return resultMap;
    }
    @GetMapping("/regist/api/studentid")
    public Map<String, Object> checkStudentId(@RequestParam String id){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        if(service.isDuplicateId(id)){
            resultMap.put("status", true);
            resultMap.put("message", "사용 중인 아이디입니다.");
        }
        else{
            resultMap.put("status", false);
            resultMap.put("message", "사용 가능한 아이디입니다.");
        }
        return resultMap;
    }
    @GetMapping("/regist/api/studentemail")
    public Map<String, Object> checkStudentEmail(@RequestParam String email){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        if(service.isDuplicateByEmail(email)){
            resultMap.put("status", true);
            resultMap.put("message", "사용 중인 이메일입니다.");
        }
        else{
            resultMap.put("status", false);
            resultMap.put("message", "사용 가능한 이메일입니다.");
        }
        return resultMap;
    }


    @PostMapping("/regist/api/teacher")
    public Map<String, Object> addTeacher(@RequestBody RegistTeacherVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        boolean sr = service.registTeacher(vo);
        if(sr){
            resultMap.put("result", "success");
            resultMap.put("message", "정상적으로 등록되었습니다.");
        }
        else{
            resultMap.put("result", "failed");
            resultMap.put("message", "정상적으로 등록되지 않았습니다.");
        }
        return resultMap;
    }
    @GetMapping("/regist/api/teacherid")
    public Map<String, Object> checkTeacherId(@RequestParam String id){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        if(service.isDuplicatedId(id)){
            resultMap.put("status", true);
            resultMap.put("message", "사용 중인 아이디입니다.");
        }
        else{
            resultMap.put("status", false);
            resultMap.put("message", "사용 가능한 아이디입니다.");
        }
        return resultMap;
    }
    @GetMapping("/regist/api/teacheremail")
    public Map<String, Object> checkTeacherEmail(@RequestParam String email){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        if(service.isDuplicatedEmail(email)){
            resultMap.put("status", true);
            resultMap.put("message", "사용 중인 이메일입니다.");
        }
        else{
            resultMap.put("status", false);
            resultMap.put("message", "사용 가능한 이메일입니다.");
        }
        return resultMap;
    }
    @PostMapping("/regist/api/admin")
    public  Map<String, Object> addAdmin(@RequestBody AdminRegistVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        boolean ar = service.addAdmin(vo);
        if(ar){
            resultMap.put("status", "success");
            resultMap.put("message", "정상적으로 등록되었습니다.");
        }
        else{
            resultMap.put("status", "false");
            resultMap.put("message", "정상적으로 등록되지 않았습니다.");
        }
        return resultMap;
    }
    @GetMapping("/regist/api/adminid")
    public Map<String, Object> checkID(@RequestParam String id){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        if(service.DuplicatedId(id)){
            resultMap.put("status", true);
            resultMap.put("message", "사용중인 ID가 있습니다.");
        }
        else{
            resultMap.put("status", false);
            resultMap.put("message", "사용가능한 ID 입니다.");
        }
        return resultMap;
    }
    @GetMapping("/regist/api/adminemail")
        public Map<String, Object> checkEmail(@RequestParam String email){
            Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
            if(service.DuplicatedEmail(email)){
                resultMap.put("status", true);
                resultMap.put("message", "사용중인 Email이 있습니다.");
            }
            else{
                resultMap.put("status", false);
                resultMap.put("message", "사용가능한 Email 입니다.");
            }
            return resultMap;
        
    }
}
