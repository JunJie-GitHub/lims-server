package org.honma.exceptions;

import cn.hutool.json.JSONUtil;

import java.io.Serializable;


public class CommonException extends RuntimeException implements Serializable {
    private ExceptionEnum codeEnum;

    public CommonException(ExceptionEnum codeEnum) {
        super(codeEnum.getMessage());
        this.codeEnum = codeEnum;
    }

    public CommonException() {
    }

    public ExceptionEnum getCodeEnum() {
        return codeEnum;
    }

    @Override
    public String toString() {
        return JSONUtil.toJsonStr(this);
    }
}
