package com.synotes.backend.entities;

import javax.persistence.*;

@Entity
@Table(name="CodingQuestion")
public class CodingQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long questionId;

    @Column(length = 1000, nullable = false, unique = true)
    private String questionDescription;


    public long getQuestionId() {
        return questionId;
    }

    public CodingQuestion(long questionId, String questionDescription) {
        this.questionId = questionId;
        this.questionDescription = questionDescription;
    }

    public CodingQuestion(){

    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }



}
