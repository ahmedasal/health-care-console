package org.healthcare.model;

import java.math.BigDecimal;

public class Doctor extends Person {
    String specialization;
    String scientificDegree;

    BigDecimal ratePerMinute;

    int noCompletedMeetings;
    int noPendingMeetings;
    int noCanceledMeetings;

    public Doctor(){};
    public Doctor(String name ,int age , String tel ,char gender,String specialization,String scientific_degree){
        super(name,age,tel,gender);
        this.specialization = specialization;
        this.scientificDegree = scientific_degree;
    }

    public void increaseCompletedMeetings() {
        this.noCompletedMeetings++;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getScientificDegree() {
        return scientificDegree;
    }

    public void setScientificDegree(String scientificDegree) {
        this.scientificDegree = scientificDegree;
    }

    public BigDecimal getRatePerMinute() {
        return ratePerMinute;
    }

    public void setRatePerMinute(BigDecimal ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    public int getNoCompletedMeetings() {
        return noCompletedMeetings;
    }

    public void setNoCompletedMeetings(int noCompletedMeetings) {
        this.noCompletedMeetings = noCompletedMeetings;
    }

    public int getNoPendingMeetings() {
        return noPendingMeetings;
    }

    public void setNoPendingMeetings(int noPendingMeetings) {
        this.noPendingMeetings = noPendingMeetings;
    }

    public int getNoCanceledMeetings() {
        return noCanceledMeetings;
    }

    public void setNoCanceledMeetings(int noCanceledMeetings) {
        this.noCanceledMeetings = noCanceledMeetings;
    }

    @Override
    public String toString() throws NullPointerException {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", ratePerMinute=" + ratePerMinute +'\'' +
                ", gender=" + gender +
                '}';
    }
}
