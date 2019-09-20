package com.breeze.ts.common.dto;

import lombok.Data;

import java.util.Date;
@Data
public class ProjectDto {
    private String name;
    private String skill;
    private String info;
    private String selfmodule;
    private Date starttime;
    private Integer months;
    private Integer aid;
}
