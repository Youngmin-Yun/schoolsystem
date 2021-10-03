package com.school.mapper;

import com.school.vo.AssignmentVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AssignmentMapper {
    public void registAssignment(AssignmentVO vo);
}
