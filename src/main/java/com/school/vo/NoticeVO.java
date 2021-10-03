package com.school.vo;

import java.util.Date;

import lombok.Data;

@Data
public class NoticeVO {
    private Integer noti_seq;
    private Date noti_date;
    private String noti_title;
    private String noti_content;
    private Integer noti_writer;
    private String ret_name;
    private Date noti_reg_dt;
}
