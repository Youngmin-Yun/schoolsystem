package com.school.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.school.mapper.StudentMapper;
import com.school.vo.AdminVO;
import com.school.vo.NoticeClassVO;
import com.school.vo.RegistStudentVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentMapper mapper;
    public List<RegistStudentVO>selectClass(Integer grade, Integer room){
        return mapper.selectClass(grade, room);
    }
    public List<AdminVO> eventList(){
        return mapper.eventList();
    }
    public List<NoticeClassVO> classEvent(Integer grade, Integer room){
        return mapper.classEvent(grade, room);
    }
    public Map<String, Object> updateStudentInfo(RegistStudentVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        mapper.updateStudentInfo(vo);
        resultMap.put("status", true);
        resultMap.put("message", "수정이 완료되었습니다.");
        return resultMap;
    }
}
