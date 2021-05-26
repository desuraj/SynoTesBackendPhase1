package com.synotes.backend.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long testId;

    @Column(name = "name", nullable = false)
    private  String name;

    @Column(name = "date", nullable = false)
    private java.sql.Date date;

    @Column(name = "time", nullable = false)
    private java.sql.Time time;

    //Test and Student Relation
    //One Test has many students
    @OneToMany(mappedBy = "test")
    private List<Student> student = new ArrayList<>();


    //Test and Admin Relation
    // Many Test have One Admin
    @ManyToOne(fetch = FetchType.LAZY)
    private Admin admin;

    //Test and McqQuestion Relation
    // One Test have Many McqQuestion
    @OneToMany(mappedBy = "test")
    private List<McqQuestions> mcqQuestions  = new ArrayList<>();


    public Test(){

    }

    public Test(Long testId, String name, Date date, Time time, String duration, Long totalMarks) {
        this.testId = testId;
        this.name = name;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.totalMarks = totalMarks;
    }


    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Long getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Long totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Column(name = "duration")
    private String duration;

    @Column(name = "totalMarks")
    private Long totalMarks;


}
