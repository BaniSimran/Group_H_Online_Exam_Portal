package com.examportal.entity;

import javax.persistence.*;

@Entity
public class TestRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testRegistrationId;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "testId")
    private Test test;

    public TestRegistration() {
    }

    public TestRegistration(Long testRegistrationId, User user, Test test) {
        this.testRegistrationId = testRegistrationId;
        this.user = user;
        this.test = test;
    }

    public Long getTestRegistrationId() {
        return testRegistrationId;
    }

    public void setTestRegistrationId(Long testRegistrationId) {
        this.testRegistrationId = testRegistrationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
