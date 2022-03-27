package com.examportal.controller;

import com.examportal.dto.*;
import com.examportal.entity.Admin;
import com.examportal.entity.Test;
import com.examportal.entity.TestRegistration;
import com.examportal.entity.User;
import com.examportal.service.OnlineExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/portal")
public class OnlineExamController {

    @Autowired
    OnlineExamService onlineExamService;


    @PostMapping("/login")
    public UserDTO loginUser(@RequestBody User user){
        return onlineExamService.loginUser(user);
    }

    @PostMapping("/admin-login")
    public AdminDTO loginAdmin(@RequestBody Admin admin){
        return onlineExamService.loginAdmin(admin);
    }

    @PostMapping("/test-list")
    public TestListDTO getTestList(@RequestBody Admin admin){
        return onlineExamService.getTestList(admin);
    }

    @PostMapping("/create-user")
    public Long createNewUser(@RequestBody User user) {
        return onlineExamService.createNewUser(user);
    }

    @PostMapping("/user-details")
    public User getUserDetails(@RequestBody User user) {
        return onlineExamService.getUserDetails(user.getUserId());
    }

    @PutMapping("/edit-user-details")
    public User editUserDetails(@RequestBody User user){
        return onlineExamService.editUserDetails(user);
    }

    @PostMapping("/all-test-list")
    public TestListDTO getAllTestList(){
        return onlineExamService.getAllTestList();
    }

    @PostMapping("/register-for-test")
    public TestRegistrationDTO registerForTest(@RequestBody TestRegistration testRegistration){
        return onlineExamService.registerForTest(testRegistration);
    }

    @PostMapping("/create-test")
    public Long createNewTest(@RequestBody Test test) {
        return onlineExamService.createNewTest(test);
    }

    @PostMapping("/test-details")
    public TestDTO getUserDetails(@RequestBody Test test) {
        return onlineExamService.getTestDetails(test.getTestId());
    }

    @PutMapping("/edit-test-details")
    public TestDTO editTestDetails(@RequestBody Test test){
        return onlineExamService.editTestDetails(test);
    }
}
