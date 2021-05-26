package com.synotes.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Result")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long resultId;

    @Column(length = 2)
    private Integer numericalAbility;

    @Column(length = 2)
    private Integer verbalAbility;

    @Column(length = 2)
    private Integer reasoningAbility;

    @Column(length = 2)
    private Integer fundamental;


    public Result(){

    }

    public Result(Integer numericalAbility, Integer verbalAbility, Integer reasoningAbility, Integer fundamental, Integer coding) {
        this.numericalAbility = numericalAbility;
        this.verbalAbility = verbalAbility;
        this.reasoningAbility = reasoningAbility;
        this.fundamental = fundamental;
        this.coding = coding;
    }

    public long getResultId() {
        return resultId;
    }

    public void setResultId(long resultId) {
        this.resultId = resultId;
    }


    public Integer getNumericalAbility() {
        return numericalAbility;
    }

    public void setNumericalAbility(Integer numericalAbility) {
        this.numericalAbility = numericalAbility;
    }

    public Integer getVerbalAbility() {
        return verbalAbility;
    }

    public void setVerbalAbility(Integer verbalAbility) {
        this.verbalAbility = verbalAbility;
    }

    public Integer getReasoningAbility() {
        return reasoningAbility;
    }

    public void setReasoningAbility(Integer reasoningAbility) {
        this.reasoningAbility = reasoningAbility;
    }

    public Integer getFundamental() {
        return fundamental;
    }

    public void setFundamental(Integer fundamental) {
        this.fundamental = fundamental;
    }

    public Integer getCoding() {
        return coding;
    }

    public void setCoding(Integer coding) {
        this.coding = coding;
    }

    @Column(length = 2)
    private Integer coding;

}
