package com.breeze.ts.entity;


import lombok.Data;

import java.util.Date;


@Data
public class Applicant {
    private Integer id;
    private String name;
    private String headurl;
    private String position;
    private String phone;
    private Date ctime;
    private String address;
}