package com.school.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.school.mapper.AdminMapper;
import com.school.service.AdminService;
import com.school.vo.AdminRegistVO;
import com.school.vo.AdminVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminAPIController {
    @Autowired
    AdminService service;
    @Autowired
    AdminMapper mapper;
    @PostMapping("/admin/api/event")
    public Map<String, Object> event(@RequestBody AdminVO vo){
        return service.schoolEvent(vo);
    }
    @DeleteMapping("/admin/api/delete")
    public Map<String, Object> deleteEvent(@RequestParam Integer seq){
        return service.deleteEventList(seq);
    }

    @GetMapping("/admin/api/search")
    public Map<String, Object> searchEvent(@RequestParam String startDate, @RequestParam String endDate){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<AdminVO> list = mapper.selectEvent(startDate, endDate);
        resultMap.put("list", list);
        return resultMap;
    }
    @PatchMapping("/admin/api/change")
    public Map<String, Object> changeList(@RequestBody AdminVO vo){
        return service.changeEventList(vo);
    }
    @PatchMapping("/admin/api/classroom_student")
    public Map<String, Object> selectClassRoom(@RequestParam Integer age){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        service.studentClass(age);
        resultMap.put("status", true);
        resultMap.put("message", "반이 입력되었습니다.");
        return resultMap;
    }
    @PatchMapping("/admin/api/classroom_teacher")
    public Map<String, Object> selectTeacherClassRoom(@RequestParam String name, @RequestParam Integer class_room, @RequestParam Integer grade){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        service.teacherClass(name, class_room, grade);
        resultMap.put("status", true);
        resultMap.put("message", "학년과 반이 입력되었습니다.");
        return resultMap;
    }
    @PatchMapping("/admin/api/change/myinfo")
    public Map<String, Object> updateAdminInfo(@RequestBody AdminRegistVO vo){
        return service.changeAdminInfo(vo);
    }
}