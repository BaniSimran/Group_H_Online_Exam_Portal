package com.examportal.dto;

import com.examportal.entity.TestRegistration;

public class TestRegistrationDTO {
    private Long testRegistrationId;

    public TestRegistrationDTO() {
    }
    public TestRegistrationDTO(TestRegistration testRegistration) {
        this.testRegistrationId = testRegistration.getTestRegistrationId();
    }

    public Long getTestRegistrationId() {
        return testRegistrationId;
    }

    public void setTestRegistrationId(Long testRegistrationId) {
        this.testRegistrationId = testRegistrationId;
    }
}
