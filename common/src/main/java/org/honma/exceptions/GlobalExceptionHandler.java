package org.honma.exceptions;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.honma.entity.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: GlobalExceptionHandler
 * @Description: Controller层通用的异常处理，每个controller只要根据业务，抛出对应的异常或返回Result对象即可，
 * 不需要再针对异常做额外处理
 * @Author: zhaoyang
 * @Date: 2019/7/30
 * @Version: V1.0
 * @Modified: by：
 * @Modified: 2019/7/30
 * @Why:
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Log logger = LogFactory.get();

    @ExceptionHandler(CommonException.class)
    public Result processCommonException(CommonException e) {
        e.printStackTrace();
        return new Result<>(e);
    }

    @ExceptionHandler(RuntimeException.class)
    public Result processRuntimeException(HttpServletRequest request, RuntimeException e) {
        e.printStackTrace();
        String url = request.getRequestURI();
        logger.error("请求{}时，运行异常：{}", url, e.getMessage());
        return new Result<>(new CommonException(ExceptionEnum.UNKNOW_ERROR));
    }

    @ExceptionHandler(Exception.class)
    public Result processException(HttpServletRequest request, Exception e) {
        e.printStackTrace();
        String url = request.getRequestURI();
        logger.error("请求{}时，发生异常：{}", url, e.getMessage());
        return new Result<>(ExceptionEnum.UNKNOW_ERROR);
    }

}
