package com.school.mapper;

import com.school.vo.AdminRegistVO;
import com.school.vo.LoginVO;
import com.school.vo.RegistStudentVO;
import com.school.vo.RegistTeacherVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    public Integer loginTeacher(LoginVO vo);
    public Integer loginAdmin(LoginVO vo);
    public Integer loginStudent(LoginVO vo);
    public RegistTeacherVO selectTeacherById (String id);
    public AdminRegistVO selectAdminById (String id);
    public RegistStudentVO selectStudentById (String id);

}
