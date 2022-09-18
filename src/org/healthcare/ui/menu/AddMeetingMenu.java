package org.healthcare.ui.menu;

import org.healthcare.model.Doctor;
import org.healthcare.model.Meeting;
import org.healthcare.model.Patients;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;

public class AddMeetingMenu implements Menu {
    public static Meeting printMeetingMenu(BufferedReader reader , Doctor doctor , Patients patient) throws IOException {
        Meeting meeting = new Meeting();
        meeting.setPatient(patient);
        meeting.setDoctor(doctor);
        System.out.println(patient);
        System.out.println(doctor);
        //date
        java.util.Date date = new java.util.Date();
        meeting.setStartDate(date);
        //duration
        System.out.println("Enter Meeting duration: ");
        int meetingDuration = Integer.parseInt(reader.readLine());
        meeting.setDurationPerMinute(meetingDuration);
        Integer duration = meeting.getDurationPerMinute();
        BigDecimal durationInBigDecimal = BigDecimal.valueOf(duration);

        //minute charge

        System.out.println("Enter minute charge: ");
        meeting.setMinuteCharge(new BigDecimal(reader.readLine()));


        //total charge

        BigDecimal totalcharge = durationInBigDecimal.multiply(meeting.getMinuteCharge());




        System.out.println("Enter taxes: ");
        BigDecimal tax = new BigDecimal(reader.readLine());
        meeting.setTaxes(tax);

        System.out.println("Enter fees: ");
        BigDecimal fees = new BigDecimal(reader.readLine());
        meeting.setTaxes(fees);

        System.out.println("Enter discount: ");
        BigDecimal discount = new BigDecimal(reader.readLine());
        meeting.setTaxes(discount);

        BigDecimal totalPayment = (totalcharge.multiply((tax.add(fees)).subtract(discount))).add(totalcharge);
        meeting.setTotalPayment(totalPayment);



        return meeting;
    }

}
