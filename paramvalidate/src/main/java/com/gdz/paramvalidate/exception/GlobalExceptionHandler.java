package com.gdz.paramvalidate.exception;

import com.gdz.paramvalidate.bean.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 *
 * @Author: guandezhi
 * @Date: 2019/3/11 14:43
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {


    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResultVo<Object> handleException(Exception e) {
        String errorMsg = "";
        if (e instanceof NullPointerException) {
            errorMsg = "参数空指针异常";
        } else if (e instanceof HttpMessageNotReadableException) {
            errorMsg = "请求参数匹配错误," + e.getLocalizedMessage();
        } else {
            errorMsg = e.getMessage();
        }
        log.error(String.format("请求异常[%s]", e));

        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setResultCode("501");
        resultVo.setResultMsg(errorMsg);
        return resultVo;
    }
}
