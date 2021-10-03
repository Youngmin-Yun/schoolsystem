package com.school.vo;

import java.util.Date;

import lombok.Data;
@Data
public class AssignmentVO {
    private Integer as_seq;
    private Integer as_res_seq;
    private Integer as_ret_seq;
    private String as_file;
    private Date as_reg_dt;
}
