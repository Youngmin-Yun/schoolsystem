package com.school.service;

import java.util.LinkedHashMap;
import java.util.Map;

import com.school.mapper.SubjectMapper;
import com.school.vo.SubjectVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
    @Autowired
    SubjectMapper s_mapper;
    public Map<String, Object> addSubject(SubjectVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        s_mapper.insertSubject(vo);
        resultMap.put("status", true);
        resultMap.put("message", "등록이 완료되었습니다.");
        return resultMap;
    }
}
