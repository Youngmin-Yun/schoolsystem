package com.school.service;

import com.school.mapper.AssignmentMapper;
import com.school.vo.AssignmentVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService {
    @Autowired
    AssignmentMapper mapper;
    public void registAssignment(AssignmentVO vo){
        mapper.registAssignment(vo);
    }
}
