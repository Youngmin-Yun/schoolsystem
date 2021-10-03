package com.school.mapper;

import java.util.List;

import com.school.vo.AdminRegistVO;
import com.school.vo.AdminVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    public void addEvent(AdminVO vo);
    public List<AdminVO> eventList();
    public void deleteEvent(Integer seq);
    public List<AdminVO> selectEvent(String startDate, String endDate);
    public void changeEvent(AdminVO vo);
    public void studentClass(Integer age);
    public void teacherClass(String name, Integer class_room, Integer grade);
    public void updateAdminInfo(AdminRegistVO vo);
}
