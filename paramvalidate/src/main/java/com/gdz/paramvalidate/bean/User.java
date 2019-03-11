package com.gdz.paramvalidate.bean;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: guandezhi
 * @Date: 2019/3/11 12:19
 */
@Data
public class User {

    @NotNull(message = "用户名不能为空")
    private String name;

    @NotNull(message = "手机号不能为空")
    private String mobile;
}
