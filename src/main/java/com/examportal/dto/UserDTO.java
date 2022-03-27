package com.examportal.dto;

import com.examportal.entity.Address;
import com.examportal.entity.User;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

public class UserDTO {

    private Long userId;
    private String userName;
    private AddressDTO userAddr;
    private Long mobNo;
    private String email;

    public UserDTO() {
    }
    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.userName = user.getUserName();
        this.userAddr = new AddressDTO(user.getUserAddr());
        this.mobNo = user.getMobNo();
        this.email = user.getEmail();
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

    public AddressDTO getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(AddressDTO userAddr) {
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
}
