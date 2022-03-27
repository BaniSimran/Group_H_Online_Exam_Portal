package com.examportal.dto;

import com.examportal.entity.Admin;
import com.examportal.entity.Question;
import com.examportal.entity.Test;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminDTO {

    private Long adminId;
    private String adminName;
    private AddressDTO adminAddr;
    private Long mobNo;
    private String email;
    private String pass;
    private List<TestDTO> testDTOList = new ArrayList<>();

    public AdminDTO() {
    }
    public AdminDTO(Admin admin) {
        this.adminId = admin.getAdminId();
        this.adminAddr = new AddressDTO(admin.getAdminAddr());
        this.adminName = admin.getAdminName();
        this.email = admin.getEmail();
        this.mobNo = admin.getMobNo();
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

    public AddressDTO getAdminAddr() {
        return adminAddr;
    }

    public void setAdminAddr(AddressDTO adminAddr) {
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

    public List<TestDTO> getTestDTOList() {
        return testDTOList;
    }

    public void setTestDTOList(List<TestDTO> testDTOList) {
        this.testDTOList = testDTOList;
    }
}
