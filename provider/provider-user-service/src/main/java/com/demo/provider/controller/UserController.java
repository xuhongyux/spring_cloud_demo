package com.demo.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuhongyu
 * @describe
 * @create 2020-12-21-15:48
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @GetMapping(value = "hellow/{user}")
    public String hellow(@PathVariable String user) {
        return "你好啊" + user;
    }
}
