package com.school.vo;

import java.util.Date;

import lombok.Data;

@Data
public class RegistStudentVO {
    private Integer res_seq;
    private String res_id;
    private String res_pwd;
    private String res_name;
    private String res_email;
    private String res_address;
    private String res_phone;
    private String res_phone2; // 보호자 연락처
    private Date res_birth;
    private Integer res_class_room;
    private Integer res_age;
}
