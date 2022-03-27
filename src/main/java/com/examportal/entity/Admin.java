package com.examportal.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long adminId;

    private String adminName;

    @OneToOne(cascade = CascadeType.ALL)
    private Address adminAddr;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "admin")
    private List<Test> test;

    private Long mobNo;
    private String email;

    private String pass;

    public Admin(Long adminId, String adminName, Address adminAddr, Long mobNo, String email, String pass) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminAddr = adminAddr;
        this.mobNo = mobNo;
        this.email = email;
        this.pass = pass;
    }

    public Admin() {
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Address getAdminAddr() {
        return adminAddr;
    }

    public void setAdminAddr(Address adminAddr) {
        this.adminAddr = adminAddr;
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

    public List<Test> getTest() {
        return test;
    }

    public void setTest(List<Test> test) {
        this.test = test;
    }
}
