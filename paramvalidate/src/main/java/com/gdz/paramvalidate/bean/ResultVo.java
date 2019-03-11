package com.gdz.paramvalidate.bean;

import lombok.Data;

/**
 * @Author: guandezhi
 * @Date: 2019/3/11 12:14
 */
@Data
public class ResultVo<T> {

    private String resultCode;

    private String resultMsg;

    private T data;

}
