package org.fanlychie.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by fanlychie on 2017/7/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String register(String username, String password) {
        System.out.println("---------------------------------------------------------");
        System.out.println(String.format("接收到注册用户请求 - {username:%s, password:%s}",
                username, password));
        System.out.println("---------------------------------------------------------");
        return username+":20881"+password;
    }

}