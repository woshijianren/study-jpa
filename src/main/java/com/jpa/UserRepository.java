package com.jpa;

import com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: zyl
 * @Date: 2020/7/19 15:05
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
