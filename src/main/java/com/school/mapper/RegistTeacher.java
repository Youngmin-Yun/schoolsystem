package com.school.mapper;

import java.util.List;

import com.school.vo.AdminVO;
import com.school.vo.RegistTeacherVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegistTeacher {
    public void addTeacher (RegistTeacherVO vo);
    public Integer selectTeacherByID(String id);
    public Integer selectTeacherByEmail(String email);
    public List<AdminVO> allTeacher();
}
