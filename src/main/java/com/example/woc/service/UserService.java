package com.example.woc.service;

import com.example.woc.entity.Account;
import com.example.woc.mapper.UserMapper;
import org.apache.ibatis.annotations.Property;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

/**
 * @author: 風楪fy
 * @create: 2022-01-15 01:22
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    //示例
    public void test(String test) {
        userMapper.test(test);
    }

    public Integer getUserAmount() {
        return userMapper.getAmountOfAccounts();
    }

    public void deleteAccount(String username) {
        userMapper.deleteAccount(username);
    }

    public void insertAccount(String username, String password, String email) {
        userMapper.insertAccount(username, password, email);
    }

    public Boolean isAccountMatch(String username, String password) {
        return userMapper.isAccountMatch(username, password) > 0;
    }

}
