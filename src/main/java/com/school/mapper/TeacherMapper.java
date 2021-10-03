package com.school.mapper;

import java.util.List;

import com.school.vo.AdminVO;
import com.school.vo.NoticeClassVO;
import com.school.vo.NoticeVO;
import com.school.vo.RegistStudentVO;
import com.school.vo.RegistTeacherVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
    // 담임이 결정되면 해당 담당반의 학생 정보를 담임선생님이 확인할 수 있도록 하는 것
    public List<RegistStudentVO>selectClass(Integer grade, Integer room);
    public List<AdminVO>eventList();
    public List<NoticeVO> noticeSchool();
    public List<RegistTeacherVO> schoolTeacher();
    public List<RegistStudentVO> allStudent();
    public void enterNotice(NoticeVO vo);
    public void enterNoticeClass(NoticeClassVO vo);
    public void updateTeacherInfo(RegistTeacherVO vo);
}
