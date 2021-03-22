package com.course.oauth2;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 类说明：
 *
 * @Author panwenzhuo
 * @Date created in 2021/3/22 20:12
 **/
@Component
public class AccountRepositoryImpl implements AccountRepository {
    private static Map<String, Account> userDB = new HashMap<>();

    @Override
    public Account findByUserName(String username) {
        return userDB.get(username);
    }

    @Override
    public void deleteAll() {
        userDB.clear();
    }

    @Override
    public void save(Account accountA) {
        userDB.put(accountA.getUserName(), accountA);
    }
}
