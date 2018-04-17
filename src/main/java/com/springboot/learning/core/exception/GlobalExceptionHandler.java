package com.springboot.learning.core.exception;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Description 全局异常处理
 * @Author zhuxiang
 * @Date 2018/4/3 9:43
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public String allExceptionHandler(HttpServletRequest request, Exception exception) {
        exception.printStackTrace();
        System.out.println("我报错了：" + exception.getLocalizedMessage());
        System.out.println("我报错了：" + exception.getCause());
        System.out.println("我报错了：" + exception.getSuppressed());
        System.out.println("我报错了：" + exception.getMessage());
        System.out.println("我报错了：" + exception.getStackTrace());
        MethodArgumentNotValidException c = (MethodArgumentNotValidException) exception;
        List<ObjectError> errors = c.getBindingResult().getAllErrors();
        StringBuffer errorMsg = new StringBuffer();
        errors.stream().forEach(x -> errorMsg.append(x.getDefaultMessage()).append(";"));
        return errorMsg.toString();
    }
}
