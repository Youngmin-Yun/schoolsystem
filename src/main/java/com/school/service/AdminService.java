package com.school.service;

import java.util.LinkedHashMap;
import java.util.Map;

import com.school.mapper.AdminMapper;
import com.school.vo.AdminRegistVO;
import com.school.vo.AdminVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminMapper mapper;
    public Map<String, Object> schoolEvent(AdminVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        mapper.addEvent(vo);
        resultMap.put("status", true);
        resultMap.put("message", "일정이 추가되었습니다.");
        return resultMap;
    }
    
    public Map<String, Object> deleteEventList(Integer seq){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        mapper.deleteEvent(seq);
        resultMap.put("status", true);
        resultMap.put("message", "일정이 삭제되었습니다.");
        return resultMap;
    }
    public Map<String, Object> changeEventList(AdminVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        mapper.changeEvent(vo);
        resultMap.put("status", true);
        resultMap.put("message", "일정이 수정되었습니다.");
        return resultMap;
    }
    public void studentClass(Integer age){
        mapper.studentClass(age);
    }
    public void teacherClass(String name, Integer class_room, Integer grade){
        mapper.teacherClass(name, class_room, grade);
    }
    public Map<String, Object> changeAdminInfo(AdminRegistVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        mapper.updateAdminInfo(vo);
        resultMap.put("status", true);
        resultMap.put("message", "정상적으로 변경되었습니다.");
        return resultMap;
    }
}
