package com.synotes.backend.entities;

import javax.persistence.*;

@Entity
@Table(name="Feedback")
public class Feedback {

    @Id
    private String feedbackId;
    private String rating;
    private String review;

    //student and feedback relation
    @OneToOne
    @JoinColumn(name = "userId")
    private Student student;

    public Feedback() {
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }


    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
