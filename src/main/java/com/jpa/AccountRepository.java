package com.jpa;

import com.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: zyl
 * @Date: 2020/7/19 15:04
 */
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
