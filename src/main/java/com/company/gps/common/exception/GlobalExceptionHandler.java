package com.company.gps.common.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器用于统一拦截接口层抛出的业务与系统异常，避免错误响应风格不一致。
 * 该类职责是把异常转换为标准响应结构，提升前后端联调效率和可观测性。
 * 它解决异常处理分散的问题，防止同类错误在不同模块返回不同格式。
 * 在系统中位于 common.exception 层，属于接口治理的统一出口。
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception exception) {
        // TODO: convert exception to ApiResponse
        return exception.getMessage();
    }
}
