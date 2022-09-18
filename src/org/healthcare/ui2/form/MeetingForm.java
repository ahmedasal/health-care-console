package org.healthcare.ui2.form;

import org.healthcare.model.Doctor;
import org.healthcare.model.Meeting;
import org.healthcare.model.Patients;

import java.math.BigDecimal;
import java.util.Date;

public class MeetingForm {

    int patientIndex;
    int doctorIndex;
    Date startDate;
    Integer durationPerMinute;
    BigDecimal minuteCharge;
    BigDecimal totalCharge;
    BigDecimal taxes;  // government
    BigDecimal fees;
    BigDecimal discount;
    BigDecimal totalPayment;






    public Meeting toMeeting() {
        Meeting meeting = new Meeting();
        meeting.setStartDate(this.startDate);
        meeting.setDurationPerMinute(durationPerMinute);
        meeting.setMinuteCharge(minuteCharge);
        meeting.setTotalCharge(totalCharge);
        meeting.setTaxes(taxes);
        meeting.setFees(fees);
        meeting.setDiscount(discount);
        meeting.setTotalPayment(totalPayment);
        return meeting;
    }

    public int getPatientIndex() {
        return patientIndex;
    }

    public void setPatientIndex(int patientIndex) {
        this.patientIndex = patientIndex;
    }

    public int getDoctorIndex() {
        return doctorIndex;
    }

    public void setDoctorIndex(int doctorIndex) {
        this.doctorIndex = doctorIndex;
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

    public BigDecimal getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(BigDecimal totalCharge) {
        this.totalCharge = totalCharge;
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
}
