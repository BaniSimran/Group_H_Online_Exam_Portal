package com.examportal.service;

import com.examportal.dao.*;
import com.examportal.dto.*;
import com.examportal.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class OnlineExamService {

    @Autowired
    OnlineExamStudentDao onlineExamStudentDao;

    @Autowired
    OnlineExamTestDao onlineExamTestDao;

    @Autowired
    OnlineExamQuestionDao onlineExamQuestionDao;

    @Autowired
    OnlineExamChoicesDao onlineExamChoicesDao;

    @Autowired
    OnlineExamAdminDao onlineExamAdminDao;

    @Autowired
    TestRegistrationDao testRegistrationDao;


    public Long createNewStudent(Student student) {
        Student myObj = onlineExamStudentDao.save(student);
        onlineExamStudentDao.flush();
        return myObj.getStudentId();
    }

    public Student getStudentDetails(Long studentId) {
        Student student = onlineExamStudentDao.findById(studentId).get();
        StudentDTO studentDTO = new StudentDTO(student);
        return student;
    }

    public StudentDTO editStudentDetails(Student student) {
        Student obj = onlineExamStudentDao.findById(createNewStudent(student)).get();
        StudentDTO studentDTO = new StudentDTO(obj);
        return studentDTO;
    }

    public Long createNewTest(Test test){
        Test myObj = onlineExamTestDao.save(test);
        test.getQuestionList().forEach(question -> question.setTest(myObj));
        for (Question q: test.getQuestionList()){
            Question ques = onlineExamQuestionDao.save(q);
            q.getChoicesList().forEach(choices -> choices.setQuestion(ques));
            for (Choices c: q.getChoicesList()){
                onlineExamChoicesDao.save(c);
            }
        }
        onlineExamTestDao.flush();
        return myObj.getTestId();
    }

    public TestDTO getTestDetails(Long testId){
        Test test = onlineExamTestDao.findById(testId).get();
        TestDTO testDTO = new TestDTO(test);
        return testDTO;
    }

    public TestDTO editTestDetails(Test test) {
        Test obj = onlineExamTestDao.findById(createNewTest(test)).get();
        TestDTO testDTO = new TestDTO(obj);
        return testDTO;
    }

    public StudentDTO loginStudent(Student student) {
        Student obj = onlineExamStudentDao.findByEmail(student.getEmail());
        if(obj==null){
            throw new RuntimeException("Student Does Not Exist");
        }
        if(!obj.getPass().toString().equals(student.getPass().toString())){
            throw new RuntimeException("Email/Password not correct.");
        }
        StudentDTO studentDTO = new StudentDTO(obj);
        return studentDTO;
    }

    public AdminDTO loginAdmin(Admin admin) {
        Admin obj = onlineExamAdminDao.findByAdminName(admin.getAdminName());
        if(obj==null){
            throw new RuntimeException("Admin Does Not Exist");
        }
        if(!obj.getPass().toString().equals(admin.getPass().toString())){
            throw new RuntimeException("AdminName/Password not correct.");
        }
        AdminDTO adminDTO = new AdminDTO(obj);
        return adminDTO;
    }

    public TestListDTO getTestList(Admin admin) {
        try {
            Admin obj = onlineExamAdminDao.findById(admin.getAdminId()).get();
            if(obj.getTest()==null){
                throw new RuntimeException("No tests mapped with Admin");
            }
            TestListDTO testListDTO = new TestListDTO(obj);
            return testListDTO;
        }catch (NoSuchElementException e){
            throw new RuntimeException("Admin Does Not Exist");
        }

    }

    public TestListDTO getAllTestList() {
        List<Test> testList = onlineExamTestDao.findAll();
        Admin obj = new Admin();
        obj.setTest(testList);
        TestListDTO testListDTO = new TestListDTO(obj);
        return testListDTO;
    }

    public TestRegistrationDTO registerForTest(TestRegistration testRegistration) {
        TestRegistration obj = testRegistrationDao.save(testRegistration);
        TestRegistrationDTO testRegistrationDTO = new TestRegistrationDTO(obj);
        return testRegistrationDTO;
    }
}
