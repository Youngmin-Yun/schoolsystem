package com.school.mapper;

import com.school.vo.AdminRegistVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminRegistMapper {
    public void registAdmin(AdminRegistVO vo);
    public Integer DuplicatedId(String id);
    public Integer DuplicatedEmail(String Email);
}
