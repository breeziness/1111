package com.breeze.ts.common.dto;


import lombok.Data;

import java.util.Date;
@Data
public class ApplicantdetailDto {
    private Integer sex;
    private Integer workyear;
    private Date data;
    private String selfinfo;
    private String selfpower;
    private String education;
    private Integer aid;
}
