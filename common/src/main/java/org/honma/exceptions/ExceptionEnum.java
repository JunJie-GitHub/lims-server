package org.honma.exceptions;

import java.io.Serializable;

import static org.honma.exceptions.ExpCodePrefix.COMMON_EXP_PREFIX;

public enum ExceptionEnum implements Serializable {

    /**
     * 通用异常
     */
    UNKNOW_ERROR(COMMON_EXP_PREFIX + "000", "未知异常"),
    PARAM_NULL(COMMON_EXP_PREFIX + "002", "参数为空"),
    ;

    private String code;
    private String message;

    ExceptionEnum() {
    }

    ExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
