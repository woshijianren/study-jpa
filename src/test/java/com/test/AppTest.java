package com.test;

import com.entity.Account;
import com.entity.User;
import com.jpa.AccountRepository;
import com.jpa.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Primary;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * @Author: zyl
 * @Date: 2020/7/19 15:10
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest {

    @Autowired
    private UserRepository user;
    @Autowired
    private AccountRepository account;

//    @Test
//    public void test1() {
//        User users = new User();
//        users.setName("cc");
//        Account account = new Account();
//        account.setAccountName("one");
//        account.setUser(users);
//
//        users.setAccount(account);
//        user.save(users);
//
//        this.account.save(account);
//    }

    @Test
    @Transactional
    @Rollback(false)
    public void test2() {
        account.deleteById(2);
        user.deleteById(2);
    }

    @Test
    public void test3() {

    }
}
