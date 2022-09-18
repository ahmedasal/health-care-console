package org.healthcare.ui2.menu;

import org.healthcare.ui2.form.MeetingForm;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;

public class AddMeetingMenu implements Menu<MeetingForm> {

    public void print(){
        Menu.ClearMenu();
        System.out.println(" 1 - Add a new meeting");
        System.out.println(" 2 - Find a meeting");
        System.out.println(" 3 - Delete a meeting");
    };
    @Override
    public MeetingForm read(BufferedReader reader) throws IOException {
        MeetingForm meeting = new MeetingForm();
        System.out.println("Enter Patient Index: ");
        meeting.setPatientIndex(Integer.parseInt(reader.readLine()));

        System.out.println("Enter Doctor Index: ");
        meeting.setDoctorIndex(Integer.parseInt(reader.readLine()));

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
