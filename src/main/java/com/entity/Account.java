package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Author: zyl
 * @Date: 2020/7/19 15:03
 */
@Entity
@Table(name = "sys_account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String accountName;

//    @OneToOne(cascade = CascadeType.ALL)
//    private User user;
}
