package com.examportal.dto;

import com.examportal.entity.Question;
import com.examportal.entity.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDTO {
    private Long testId;
    private String testName;
    private List<QuestionDTO> questionList = new ArrayList<>();

    public TestDTO() {
    }

    public TestDTO(Test test) {
        this.testId = test.getTestId();
        this.testName = test.getTestName();
        for (Question q: test.getQuestionList()){
            QuestionDTO questionDTO = new QuestionDTO(q);
            questionList.add(questionDTO);
        }
    }

    public TestDTO(Test test, String useCase) {
        this.testId = test.getTestId();
        this.testName = test.getTestName();
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public List<QuestionDTO> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<QuestionDTO> questionList) {
        this.questionList = questionList;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }
}
