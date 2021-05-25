package com.synotes.backend.entities;

import javax.persistence.*;


@Entity
@Table(name = "TestCase")
public class TestCase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long testCaseId;


    @Column(length = 50, nullable = false, unique = true)
    private String input;

    @Column(length = 20, nullable = false)
    private String output;

    @Column(length = 3, nullable = false)
    private Integer marks;

    public TestCase(){

    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
}
