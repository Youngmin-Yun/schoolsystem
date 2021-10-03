package com.school.api;

import java.util.Map;

import com.school.service.NoticService;
import com.school.service.TeacherService;
import com.school.vo.NoticeClassVO;
import com.school.vo.NoticeVO;
import com.school.vo.RegistTeacherVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherAPIController {
    @Autowired
    NoticService service;
    @Autowired
    TeacherService t_service;
    @PostMapping("/teacher/api/event")
    public Map<String, Object> addEvent(@RequestBody NoticeVO vo){
        return service.enterNotice(vo);
    }
    @PostMapping("/teacher/api/class_event")
    public Map<String, Object> addClassEvent(@RequestBody NoticeClassVO vo){
        return t_service.enterNoticeClass(vo);
    }
    @PatchMapping("/teacher/api/info_change")
    public Map<String, Object> updateTeacherInfo(@RequestBody RegistTeacherVO vo){
        return t_service.updateTeacherInfo(vo);
    }
}
