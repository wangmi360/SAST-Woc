package com.example.woc.mapper;

import com.example.woc.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author: 風楪fy
 * @create: 2022-01-15 01:22
 **/
@Mapper
@Repository
public interface UserMapper {
    //示例
    void test(@Param("value") String test);

    //
    Integer getAmountOfAccounts();

    void deleteAccount(@Param("username") String username);

    void insertAccount(@Param("username") String username,
                       @Param("password") String password,
                       @Param("email") String email);

    Integer isAccountMatch(@Param("username") String username,
                           @Param("password") String password);
}
