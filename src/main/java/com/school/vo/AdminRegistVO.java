package com.school.vo;

import java.util.Date;

import lombok.Data;

@Data
public class AdminRegistVO {
    private Integer ad_seq;
    private String ad_id;
    private String ad_pwd;
    private String ad_name;
    private String ad_address;
    private String ad_phone;
    private String ad_email;
    private String ad_status;
    private Date ad_birth;
}
