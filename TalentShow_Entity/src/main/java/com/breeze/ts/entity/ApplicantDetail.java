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
public class ApplicantDetail {
    private Integer id;
    /**
     * 1 女 2 男
     */
    private Integer sex;
    private Integer workyear;
    private Date birthday;
    private String selfinfo;
    private String selfpower;
    private String education;
    private Integer aid;
}
