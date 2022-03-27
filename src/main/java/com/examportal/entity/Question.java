package com.examportal.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quesId;

    private String quesDesc;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
    private List<Choices> choicesList;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "testId")
    private Test test;


    public Question() {
    }

    public Question(Long quesId, String quesDesc, List<Choices> choicesList, Test test) {
        this.quesId = quesId;
        this.quesDesc = quesDesc;
        this.choicesList = choicesList;
        this.test = test;
    }

    public Long getQuesId() {
        return quesId;
    }

    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }

    public String getQuesDesc() {
        return quesDesc;
    }

    public void setQuesDesc(String quesDesc) {
        this.quesDesc = quesDesc;
    }

    public List<Choices> getChoicesList() {
        return choicesList;
    }

    public void setChoicesList(List<Choices> choicesList) {
        this.choicesList = choicesList;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
