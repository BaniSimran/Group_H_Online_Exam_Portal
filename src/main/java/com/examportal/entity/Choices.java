package com.examportal.entity;

import javax.persistence.*;

@Entity
@Table(name = "choices")
public class Choices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long choiceId;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "quesId")
    private Question question;

    private String choiceDesc;

    private int ans;

    public Choices() {
    }

    public Choices(Long choiceId, Question question, String choiceDesc, int ans) {
        this.choiceId = choiceId;
        this.question = question;
        this.choiceDesc = choiceDesc;
        this.ans = ans;
    }

    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Long choiceId) {
        this.choiceId = choiceId;
    }

    public String getChoiceDesc() {
        return choiceDesc;
    }

    public void setChoiceDesc(String choiceDesc) {
        this.choiceDesc = choiceDesc;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}
