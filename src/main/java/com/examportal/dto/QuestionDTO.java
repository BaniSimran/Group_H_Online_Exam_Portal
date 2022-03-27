package com.examportal.dto;

import com.examportal.entity.Choices;
import com.examportal.entity.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionDTO {

    private Long quesId;
    private String quesDesc;
    private List<ChoicesDTO> choicesList = new ArrayList<>();

    public QuestionDTO() {
    }

    public QuestionDTO(Question question) {
        this.quesId = question.getQuesId();
        this.quesDesc = question.getQuesDesc();
        for (Choices c: question.getChoicesList()){
            ChoicesDTO choicesDTO = new ChoicesDTO(c);
            choicesList.add(choicesDTO);
        }
    }

    public String getQuesDesc() {
        return quesDesc;
    }

    public void setQuesDesc(String quesDesc) {
        this.quesDesc = quesDesc;
    }

    public List<ChoicesDTO> getChoicesList() {
        return choicesList;
    }

    public void setChoicesList(List<ChoicesDTO> choicesList) {
        this.choicesList = choicesList;
    }

    public Long getQuesId() {
        return quesId;
    }

    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }
}
