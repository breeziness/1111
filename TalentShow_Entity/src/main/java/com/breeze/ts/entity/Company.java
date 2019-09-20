package com.breeze.ts.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: TalentShow
 * @description:
 * @author: Feri
 * @create: 2019-09-10 11:42
 */
@Data
public class Company {
    private Integer id;
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