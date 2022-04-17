package com.examportal.controller;

import com.examportal.dto.AdminDTO;
import com.examportal.dto.StudentDTO;
import com.examportal.entity.Admin;
import com.examportal.entity.Student;
import com.examportal.service.OnlineExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebViewController {
//
//    @Autowired
//    OnlineExamService onlineExamService;
//
//    @GetMapping("/")
//    public String indexPage(Model model){
//        return "index";
//    }
//    @GetMapping(value = "/student-login")
//    public String studentLogin(Model model){
//        model.addAttribute("student", new Student());
//        return "studentLogin";
//    }
//    @GetMapping(value = "/register-student")
//    public String registerStudent(Model model){
//        model.addAttribute("student", new Student());
//        return "registerStudent";
//    }
//    @GetMapping(value = "/admin-login")
//    public String adminLogin(Model model){
//        model.addAttribute("admin", new Admin());
//        return "adminLogin";
//    }
//
//
//    @PostMapping(value = "/")
//    public String registerStudentSave(@ModelAttribute Student student, Model model){
//        Long id = onlineExamService.createNewStudent(student);
//        model.addAttribute("student",student);
//        model.addAttribute("id",id);
//        return "index";
//    }
//
//    @RequestMapping(value = "/student-dashboard", method = RequestMethod.POST)
//    public String studentDashboard(@ModelAttribute Student student, Model model){
//        StudentDTO std = onlineExamService.loginStudent(student);
//        model.addAttribute("student",std);
//        return "studentDashboard";
//    }
//
//    @RequestMapping(value = "/admin-dashboard", method = RequestMethod.POST)
//    public String adminDashboard(@ModelAttribute Admin admin, Model model){
//        AdminDTO std = onlineExamService.loginAdmin(admin);
//        model.addAttribute("admin",std);
//        return "adminDashboard";
//    }


}
