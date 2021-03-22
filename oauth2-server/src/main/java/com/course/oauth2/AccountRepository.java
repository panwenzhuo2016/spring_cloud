package com.course.oauth2;

import org.springframework.stereotype.Component;


public interface AccountRepository  {
 
    /**
     * 根据用户名查找账户信息
     * @param username 用户名
     * @return 账户信息
     */
    Account findByUserName(String username);

    void deleteAll();

    void save(Account accountA);
}