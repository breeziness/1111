package com.breeze.ts.common.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CompanyDto {
    private String name;
    private String duty;
    private Date startTime;
    private Date endTime;
    private String workcontent;
    /**
     * 薪水 月薪，单位元
     */
    private Integer salary;
    private Integer aid;
}
