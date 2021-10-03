package com.school.api;

import java.util.Map;

import com.school.service.StudentService;
import com.school.vo.RegistStudentVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentAPIController {
    @Autowired
    StudentService service;
    @PatchMapping("/student/update/api")
    public Map<String, Object> studentInfoUpdate(@RequestBody RegistStudentVO vo){
        System.out.println("api");
        return service.updateStudentInfo(vo);
    }
}
