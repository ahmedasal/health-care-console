package org.healthcare.core;

import org.healthcare.model.*;
import org.healthcare.model.WindowStatus;
import org.healthcare.ui.menu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdTry {
    public static void main(String[] args) {
        WindowStatus windowStatus = WindowStatus.main_menu;
        MeetingStatus meetingStatus = MeetingStatus.pending;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Doctor[] doctors = new Doctor[10];
        Patients[] patients = new Patients[10];
        Meeting[] meetings = new Meeting[10];
        int doctorIndex = 0;
        int patientIndex = 0;
        int meetingIndex = 0;

        try {

            while(true){
                Menu.ClearMenu();
                switch (windowStatus) {
                    case  main_menu:
                        MainMenu.printMainMenu();
                        break;
                    case add_doctor:
                        Doctor doctor = AddDoctorMenu.printDoctorMenu(reader);
                        doctors[doctorIndex] = doctor;
                        doctorIndex++;
                        Menu.ClearMenu();
                        System.out.println(doctor);
                        System.out.println("doctor added successfully ,please enter 0 if you want to exit or any input from next menu");
                        break;
                    case add_patient:
                        Patients patient = AddPatientMenu.printPatientDoctor(reader);
                        patients[patientIndex] = patient;
                        patientIndex++;
                        Menu.ClearMenu();
                        System.out.println(patient);
                        System.out.println("patient added successfully ,please enter 0 if you want to exit or any input from next menu");
                        break;
                    case add_meeting:

                        meetingIndex++;

                        while(meetingStatus == MeetingStatus.pending ){
                            int newMeetingStatus = 0;
                            System.out.println("pending.............");
                            System.out.println("if meeting stats (1) or is cancelled(2) press the mentioned no. ");
                            newMeetingStatus = Integer.parseInt(reader.readLine());
                            meetingStatus =MeetingStatus.changeMeetingStatus(newMeetingStatus);
                        }
                        switch (meetingStatus){
                            case completed:
                                Meeting meeting = AddMeetingMenu.printMeetingMenu(reader, doctors[doctorIndex-1],patients[patientIndex-1]);
                                meetings[meetingIndex] = meeting;
                                System.out.println(meeting);
                                System.out.println("meeting added successfully ,please enter 0 if you want to exit or any input from next menu");
                                System.out.println("completed");
                            case canceled:
                                break;
                        }


                }

                int  newStatus = Integer.parseInt(reader.readLine());
                windowStatus = WindowStatus.changeWindowStatus(newStatus);
                if (windowStatus == null || windowStatus == WindowStatus.exit){
                    return;
                }


            }




        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
