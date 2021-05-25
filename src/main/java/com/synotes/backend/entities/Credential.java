package com.synotes.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Credential")
public class Credential {

    //extra pk credential
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long credentialId;

    @Column(length = 50, nullable = false, unique = true)
    private String loginId;

    @Column(length = 10, nullable = false)
    private String password;

    public Credential(){

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
