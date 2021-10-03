package com.school.vo;

import java.util.Date;

import lombok.Data;

@Data
public class NoticeClassVO {
    private Integer nc_seq;
    private String nc_title;
    private String nc_content;
    private Date nc_date;
    private Date nc_write_time;
    private Integer nc_class_room;    
    private Integer nc_grade_age;
}
