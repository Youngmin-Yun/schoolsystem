package com.school.service;

import java.util.LinkedHashMap;
import java.util.Map;

import com.school.mapper.TeacherMapper;
import com.school.vo.NoticeVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticService {
    @Autowired
    TeacherMapper mapper;
    public Map<String, Object> enterNotice(NoticeVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        mapper.enterNotice(vo);
        resultMap.put("status", true);
        resultMap.put("message", "입력되었습니다.");
        return resultMap;
    }
}
