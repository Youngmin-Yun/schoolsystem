package com.school.mapper;

import java.util.List;

import com.school.vo.AdminVO;
import com.school.vo.RegistStudentVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegistStudent {
    public void addStudent(RegistStudentVO vo);
    public Integer selectStudentByID(String id);
    public Integer selectStudentByEmail(String email);
    public List<AdminVO>allStudent();
}
