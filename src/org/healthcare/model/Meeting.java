package org.healthcare.model;

import java.math.BigDecimal;
import java.util.Date;

public class Meeting {
    Patients patient;
    Doctor doctor;
    Date startDate;
    Integer durationPerMinute;
    BigDecimal minuteCharge;
    BigDecimal totalCharge;
    BigDecimal taxes;  // government
    BigDecimal fees;
    BigDecimal discount;
    BigDecimal totalPayment;

    int meetingIndex;

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getDurationPerMinute() {
        return durationPerMinute;
    }

    public void setDurationPerMinute(Integer durationPerMinute) {
        this.durationPerMinute = durationPerMinute;
    }

    public BigDecimal getMinuteCharge() {
        return minuteCharge;
    }

    public void setMinuteCharge(BigDecimal minuteCharge) {
        this.minuteCharge = minuteCharge;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public BigDecimal getFees() {
        return fees;
    }

    public void setFees(BigDecimal fees) {
        this.fees = fees;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(BigDecimal totalPayment) {
        this.totalPayment = totalPayment;
    }

    public BigDecimal getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(BigDecimal totalCharge) {
        this.totalCharge = totalCharge;
    }

    public int getMeetingIndex() {
        return meetingIndex;
    }

    public void setMeetingIndex(int meetingIndex) {
        this.meetingIndex = meetingIndex;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "startDate=" + startDate +
                ", durationPerMinute=" + durationPerMinute +
                ", minuteCharge=" + minuteCharge +
                ", totalCharge=" + totalCharge +
                ", taxes=" + taxes +
                ", fees=" + fees +
                ", discount=" + discount +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
