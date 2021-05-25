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
    @Column(name = "testId", nullable = false, unique = true)
    private Long testId;

    @Column(name = "name", nullable = false)
    private  String name;

    @Column(name = "date", nullable = false)
    private java.sql.Date date;

    @Column(name = "time", nullable = false)
    private java.sql.Time time;

    //One Test has many students
    @OneToMany(targetEntity = Student.class, mappedBy = "test", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Student> student = new ArrayList<>();

    // One Test has One Result // testId column in Test is the Foreign key to Result
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TestId",referencedColumnName = "testId")
    private Result result;


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

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
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
