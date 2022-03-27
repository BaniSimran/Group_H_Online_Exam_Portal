package com.examportal.dto;

import com.examportal.entity.Choices;

import java.awt.*;

public class ChoicesDTO {
    private Long choiceId;
    private String choiceDesc;
    private int ans;

    public ChoicesDTO() {
    }

    public ChoicesDTO(Choices choices) {
        this.choiceId = choices.getChoiceId();
        this.choiceDesc = choices.getChoiceDesc();
        this.ans = choices.getAns();
    }

    public String getChoiceDesc() {
        return choiceDesc;
    }

    public void setChoiceDesc(String choiceDesc) {
        this.choiceDesc = choiceDesc;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Long choiceId) {
        this.choiceId = choiceId;
    }
}
