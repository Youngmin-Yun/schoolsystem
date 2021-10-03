package com.school.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.school.mapper.TeacherMapper;
import com.school.vo.AdminVO;
import com.school.vo.NoticeClassVO;
import com.school.vo.NoticeVO;
import com.school.vo.RegistStudentVO;
import com.school.vo.RegistTeacherVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    TeacherMapper mapper;
    public List<RegistStudentVO>selectClass(Integer grade, Integer room){
        return mapper.selectClass(grade, room);
    }
    public List<AdminVO> eventList(){
        return mapper.eventList();
    }
    public List<NoticeVO> noticeSchool(){
        return mapper.noticeSchool();
    }
    public List<RegistTeacherVO> schoolTeacher(){
        return mapper.schoolTeacher();
    }
    public List<RegistStudentVO> allStudent(){
        return mapper.allStudent();
    }
    public Map<String, Object> enterNoticeClass(NoticeClassVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        mapper.enterNoticeClass(vo);
        resultMap.put("status", true);
        resultMap.put("message", "정상 입력되었습니다.");
        return resultMap;
    }
    public Map<String, Object> updateTeacherInfo(RegistTeacherVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        mapper.updateTeacherInfo(vo);
        resultMap.put("status", true);
        resultMap.put("message", "정상적으로 변경 되었습니다.");
        return resultMap;
    }
}
