package com.school.vo;

import java.util.Date;

import lombok.Data;

@Data
public class RegistTeacherVO {
    private Integer ret_seq;
    private String ret_id;
    private String ret_pwd;
    private String ret_name;
    private String ret_email;
    private Date ret_birth;
    private String ret_address;
    private String ret_phone;
    private String ret_subject;
    private Integer ret_class_room;
    private Integer ret_grade_age;
}
