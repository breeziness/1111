package com.breeze.ts.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: TalentShow
 * @description:
 * @author: Feri
 * @create: 2019-09-10 11:43
 */
@Data
public class Project {
    private Integer id;
    private String name;
    private String skill;
    private String info;
    private String selfmodule;
    private Date starttime;
    private Integer months;
    private Integer aid;
}