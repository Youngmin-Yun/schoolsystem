package com.school.mapper;

import java.util.List;

import com.school.vo.SubjectVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubjectMapper {
    public void insertSubject(SubjectVO vo);
    public List<SubjectVO>allSubject();
}
