package com.wojucai.entity.codeEnum;

public enum ResultEnum {
    LoginSuccess(10000, "登录成功!"),
    RequestSuccess(10001, "请求成功!"),
    ParamIllegal(20000, "参数不合法")
    ;

    public int code;
    public String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
