package com.school.api;

import java.util.Map;

import com.school.service.SubjectService;
import com.school.vo.SubjectVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectAPIController {
    @Autowired
    SubjectService s_service;
    @PostMapping("class/api/subject")
    public Map<String, Object> addSubject(@RequestBody SubjectVO vo){
        return s_service.addSubject(vo);
    }
}
