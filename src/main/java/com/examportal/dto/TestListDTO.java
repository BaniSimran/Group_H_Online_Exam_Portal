package com.examportal.dto;

import com.examportal.entity.Admin;
import com.examportal.entity.Test;

import java.util.ArrayList;
import java.util.List;

public class TestListDTO {
    private List<TestDTO> testDTOList = new ArrayList<>();

    public TestListDTO() {
    }
    public TestListDTO(Admin admin) {
        for (Test t: admin.getTest()){
            TestDTO testDTO = new TestDTO(t,"testlist");
            this.testDTOList.add(testDTO);
        }
    }

    public List<TestDTO> getTestDTOList() {
        return testDTOList;
    }

    public void setTestDTOList(List<TestDTO> testDTOList) {
        this.testDTOList = testDTOList;
    }
}
