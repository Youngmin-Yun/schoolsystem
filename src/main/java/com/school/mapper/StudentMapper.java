package com.school.mapper;

import java.util.List;

import com.school.vo.AdminVO;
import com.school.vo.NoticeClassVO;
import com.school.vo.RegistStudentVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    public List<RegistStudentVO>selectClass(Integer grade, Integer room);
    public List<AdminVO>eventList();
    public List<NoticeClassVO>classEvent(Integer room, Integer grade);
    public void updateStudentInfo(RegistStudentVO vo);
}
