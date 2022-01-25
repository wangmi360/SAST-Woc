package com.example.woc.controller;

import com.example.woc.entity.Account;
import com.example.woc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author: 風楪fy
 * @create: 2022-01-15 04:19
 **/
@RestController
@RequestMapping("/admin")
public class AdminController {

    //请仿照 User 补充 Admin 的三层架构并完成接口

    @Autowired
    UserService userService;

    /**
     * 获取当前的账户总数
     *
     * @return
     */
    @GetMapping("/getAmount")
    public Integer getAmountOfAccounts() {
        return userService.getUserAmount();
    }

    /**
     * 根据用户名删除账户
     *
     * @param
     */
    @PutMapping("deleteAccount")
    public void deleteAccount(@RequestBody Account account) {
        userService.deleteAccount(account.getUsername());
    }
}
