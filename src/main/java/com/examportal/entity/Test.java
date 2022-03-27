package com.examportal.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testId;

    private String testName;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "adminId")
    private Admin admin;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
    private List<Question> questionList;

    public Test() {
    }

    public Test(Long testId, String testName, Admin admin, List<Question> questionList) {
        this.testId = testId;
        this.testName = testName;
        this.admin = admin;
        this.questionList = questionList;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
