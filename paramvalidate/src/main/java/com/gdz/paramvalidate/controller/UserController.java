package com.gdz.paramvalidate.controller;

import com.gdz.paramvalidate.annotation.ParamValidate;
import com.gdz.paramvalidate.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author: guandezhi
 * @Date: 2019/3/11 12:15
 */
@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @ParamValidate
    @RequestMapping("/addUser")
    public String addUser(@RequestBody @Valid User user, BindingResult result) throws Exception {
        int i = 1 / 0;
        return "success";
    }
}
