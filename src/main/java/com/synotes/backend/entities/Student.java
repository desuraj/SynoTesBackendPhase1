package com.synotes.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,unique = true)
    private long userId;

    @Column(length = 15, nullable = false)
    private String firstName;

    @Column(length = 15, nullable = false)
    private String lastName;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(length = 10, nullable = false, unique = true)
    private String mobile;

    @Column(length = 100, nullable = false)
    private String College;


    // Student and Test Relation
    //Many Student have One Test
    @ManyToOne(fetch = FetchType.LAZY)
    private Test test;

    public Student(){

    }

    public Student(long userId, String firstName, String lastName, String email, String mobile, String college) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        College = college;
    }



    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }


}
