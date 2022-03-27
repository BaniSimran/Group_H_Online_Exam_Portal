package com.examportal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;

    @OneToOne(cascade = CascadeType.ALL)
    private Address userAddr;

    private Long mobNo;
    private String email;

    private String pass;

    public User() {
    }

    public User(Long userId, String userName, Address userAddr, Long mobNo, String email, String pass) {
        this.userId = userId;
        this.userName = userName;
        this.userAddr = userAddr;
        this.mobNo = mobNo;
        this.email = email;
        this.pass = pass;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(Address userAddr) {
        this.userAddr = userAddr;
    }

    public Long getMobNo() {
        return mobNo;
    }

    public void setMobNo(Long mobNo) {
        this.mobNo = mobNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
