package com.school.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.school.mapper.TestMapper;
import com.school.vo.SubjectVO;
import com.school.vo.TestVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestMapper mapper;
    public Map<String, Object> insertScore(TestVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        mapper.insertScore(vo);
        resultMap.put("stuats", true);
        resultMap.put("message", "성적입력이 정상적으로 완료 되었습니다.");
        return resultMap;
    }
    public List<SubjectVO> subjectList(){
        return mapper.subjectList();
    }
}