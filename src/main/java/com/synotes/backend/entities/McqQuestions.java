package com.synotes.backend.entities;

import javax.persistence.*;

@Entity
@Table(name="McqQuestions")
public class McqQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,unique = true)
    private long questionId;

    @Column(length = 1000,nullable = false, unique = true)
    private String questionDescription;

    //Set type
    @Column(length = 200, nullable = false, unique = true)
    private String Options;

    @Column(length = 50, nullable = false, unique = true)
    private String answer;

    @Column(length = 20, nullable = false)
    private String category;

    public McqQuestions(){

    }

    public McqQuestions(long questionId, String questionDescription, String options, String answer, String category) {
        this.questionId = questionId;
        this.questionDescription = questionDescription;
        Options = options;
        this.answer = answer;
        this.category = category;
    }

    public long getQuestionId() {
        return questionId;
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

    public String getOptions() {
        return Options;
    }

    public void setOptions(String options) {
        Options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
