package com.school.vo;



import java.util.Date;

import lombok.Data;

@Data
public class AdminVO {
    // 학사 일정
    private Integer ad_seq;
    private Date ad_event_date;
    private String ad_event_content;

    // 교사 정보 불러오기
    private String ret_name;
    private String ret_email;
    private Date ret_birth;
    private String ret_address;
    private String ret_phone;
    private String ret_subject;
    private Integer ret_class_room;
    private Integer ret_grade_age;
    
    // 학생 정보 불러오기
    private String res_name;
    private String res_email;
    private String res_address;
    private String res_phone;
    private String res_phone2;
    private Date res_birth;
    private Integer res_class_room;
    private Integer res_grade;
    private Integer res_age;

}
