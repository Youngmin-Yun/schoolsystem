package com.school.api;

import java.util.Map;

import com.school.service.TestService;
import com.school.vo.TestVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPIController {
    @Autowired
    TestService service;
    @PostMapping("/testscore/api/insert")
    public Map<String, Object> insertScore(@RequestBody TestVO vo){
        return service.insertScore(vo);
    }
}
