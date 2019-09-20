package com.breeze.ts.common.config;
/*
* 枚举类型
* 统一结果返回码
* 200成功
* 400失败
* */
public enum Renum {
    SUCCESS(200),ERROR(400);
    private int code;
    private Renum(int code){
        this.code = code;
    }
    public int getCode() {
        return this.code;
    }
}
