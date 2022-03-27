package com.examportal.entity;

import javax.persistence.*;

@Entity
public class TestRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testRegistrationId;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "studentId")
    private Student student;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "testId")
    private Test test;

    public TestRegistration() {
    }

    public TestRegistration(Long testRegistrationId, Student student, Test test) {
        this.testRegistrationId = testRegistrationId;
        this.student = student;
        this.test = test;
    }

    public Long getTestRegistrationId() {
        return testRegistrationId;
    }

    public void setTestRegistrationId(Long testRegistrationId) {
        this.testRegistrationId = testRegistrationId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
