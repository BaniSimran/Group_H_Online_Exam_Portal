package com.examportal.controller;

import com.examportal.dto.*;
import com.examportal.entity.Admin;
import com.examportal.entity.Student;
import com.examportal.entity.Test;
import com.examportal.entity.TestRegistration;
import com.examportal.service.OnlineExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/portal")
public class OnlineExamController {

    @Autowired
    OnlineExamService onlineExamService;

    @PostMapping("/login")
    public StudentDTO loginStudent(@RequestBody Student student){
        return onlineExamService.loginStudent(student);
    }

    @PostMapping("/admin-login")
    public AdminDTO loginAdmin(@RequestBody Admin admin){
        return onlineExamService.loginAdmin(admin);
    }

    @PostMapping("/test-list")
    public TestListDTO getTestList(@RequestBody Admin admin){
        return onlineExamService.getTestList(admin);
    }

    @PostMapping("/create-student")
    public Long createNewStudent(@RequestBody Student student) {
        return onlineExamService.createNewStudent(student);
    }

    @PostMapping("/student-details")
    public Student getStudentDetails(@RequestBody Student student) {
        return onlineExamService.getStudentDetails(student.getStudentId());
    }

    @PutMapping("/edit-student-details")
    public StudentDTO editStudentDetails(@RequestBody Student student){
        return onlineExamService.editStudentDetails(student);
    }

    @GetMapping("/all-test-list")
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
    public TestDTO getTestDetails(@RequestBody Test test) {
        return onlineExamService.getTestDetails(test.getTestId());
    }

    @PutMapping("/edit-test-details")
    public TestDTO editTestDetails(@RequestBody Test test){
        return onlineExamService.editTestDetails(test);
    }
}
