package com.synotes.backend.entities;


import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 15, nullable = false, unique = true)
    private String employId;

    @Column(length = 25)
    private String name;

    @Column(length = 50, nullable = false, unique = true)
    private String loginId;

    @Column(length = 10, nullable = false)
    private String password;

    public Admin(){

    }

    public String getEmployId() {
        return employId;
    }

    public void setEmployId(String employId) {
        this.employId = employId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
