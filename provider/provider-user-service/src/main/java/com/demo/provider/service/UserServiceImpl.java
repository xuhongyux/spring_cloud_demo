package com.demo.provider.service;

import com.demo.provider.api.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author xuhongyu
 * @describe
 * @create 2020-12-21-15:55
 */
@Service(version = "1.0.0",timeout = 50000)
public class UserServiceImpl implements UserService {
    @Override
    public String hellow(String name) {
        return "你好"+ name;
    }
}
