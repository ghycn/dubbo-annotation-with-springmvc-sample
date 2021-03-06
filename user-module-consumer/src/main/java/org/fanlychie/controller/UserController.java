package org.fanlychie.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.fanlychie.service.UserService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanlychie on 2017/7/26.
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/user/register")
    public String register(String username, String password) {
        username ="ghy";
        password ="ghy";
        if (!StringUtils.hasText(username) || !StringUtils.hasText(password)) {
            return "用户名或密码不能为空";
        }
        String str = userService.register(username, password);
        System.out.println(str);
        return str;
    }

}