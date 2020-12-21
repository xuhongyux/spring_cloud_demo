package com.demo.consumer.controller;

import com.demo.provider.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuhongyu
 * @describe
 * @create 2020-12-21-16:08
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping(value = "hellow/{name}")
    public String hellow(@PathVariable String name) {
        return userService.hellow(name);
    }

}
