package com.example.woc.controller;

import com.example.woc.entity.Account;
import com.example.woc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 風楪fy
 * @create: 2022-01-15 01:22
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 完成注册功能
     * 选做：对密码进行加密处理
     *
     * @param account
     */
    @PostMapping("/register")
    public void uploadUsername(@RequestBody Account account) {
        userService.insertAccount(account.getUsername(), account.getPassword(), account.getEmail());
    }

    /**
     * 完成登录功能
     *
     * @param account
     * @return 是否登录成功
     */
    @PostMapping("/login")
    public Boolean login(@RequestBody Account account) {
        return userService.isAccountMatch(account.getUsername(), account.getPassword());
    }
}


