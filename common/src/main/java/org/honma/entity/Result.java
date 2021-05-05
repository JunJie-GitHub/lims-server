package org.honma.entity;

/**
 * @Author: lijunjie
 * @Date: 2021/4/28
 */

import lombok.Data;
import org.honma.exceptions.CommonException;
import org.honma.exceptions.ExceptionEnum;

import java.io.Serializable;


@Data
//@ApiModel(description = "查询结果类")
public class Result<T> implements Serializable {

//    @ApiModelProperty(value = "是否成功")
    private Boolean success;

//    @ApiModelProperty(value = "错误代码")
    private String errorCode;

//    @ApiModelProperty(value = "消息")
    private String message;

//    @ApiModelProperty(value = "分页结果")
    private PageDTO page;

//    @ApiModelProperty(value = "结果数据集")
    private T data;

    public Result() {
        this.success = true;
        this.message = "success";
    }

    public Result(Boolean success) {
        this.success = success;
    }

    public Result(T data) {
        this.success = true;
        this.message = "success";
        this.data = data;
    }

    public Result(Boolean success, T data) {
        this.success = success;
        this.data = data;
        this.message = "success";
    }

    public Result(T data, PageDTO page) {
        this.success = true;
        this.page = page;
        this.data = data;
        this.message = "success";
    }

    public Result(CommonException exception) {
        this.success = false;
        this.errorCode = exception.getCodeEnum().getCode();
        this.message = exception.getCodeEnum().getMessage();
    }

    public Result(ExceptionEnum exception) {
        this.success = false;
        this.errorCode = exception.getCode();
        this.message = exception.getMessage();
    }

    public Result(T data, CommonException exception) {
        this.success = false;
        this.data = data;
        this.errorCode = exception.getCodeEnum().getCode();
        this.message = exception.getCodeEnum().getMessage();
    }

    public Result(T data, PageDTO page, CommonException exception) {
        this.success = false;
        this.data = data;
        this.page = page;
        this.errorCode = exception.getCodeEnum().getCode();
        this.message = exception.getCodeEnum().getMessage();
    }

}

