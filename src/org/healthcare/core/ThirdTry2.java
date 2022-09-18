package org.healthcare.core;

import org.healthcare.mydb.Database;
import org.healthcare.model.*;
import org.healthcare.myservice.DoctorService;
import org.healthcare.myservice.MeetingService;
import org.healthcare.myservice.PatientService;
import org.healthcare.ui2.form.MeetingForm;
import org.healthcare.ui2.menu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdTry2 {

    public static final int MENU_MAIN = 0;
    public static final int MENU_ADD_DOCTOR = 1;
    public static final int MENU_ADD_PATIENT = 2;
    public static final int MENU_ADD_MEETING = 3;


    public static final int EXIT = -1;
    public static final int MENU_ADD = 1;
    public static final int MENU_Find = 2;
    public static final int MENU_Remove = 3;

    static final Database db = new Database();
    static final PatientService patientService = new PatientService(db);
    static final DoctorService doctorService = new DoctorService(db);
    static final MeetingService meetingService = new MeetingService(db);


    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int windowStatus = MENU_MAIN;
        Menu currentMenu = new MainMenu();


        try {

            while (true) {
                Menu.ClearMenu();
                switch (windowStatus) {
                    case MENU_MAIN:
                        currentMenu = new MainMenu();
                        break;
                    case MENU_ADD_DOCTOR:
                        currentMenu = new AddDoctorMenu();
                        break;
                    case MENU_ADD_PATIENT:
                        currentMenu = new AddPatientMenu();
                        break;
                    case MENU_ADD_MEETING:
                        currentMenu = new AddMeetingMenu();
                        break;

                    default:
                        return;

                }

                currentMenu.print();
                int subMenuStatus;
                Object newData;
                int index;

                if (currentMenu instanceof AddDoctorMenu) {
                    System.out.println("please enter no from menu: ");
                    subMenuStatus = Integer.parseInt((reader.readLine()));
                    switch (subMenuStatus) {
                        case 1:
                            newData = currentMenu.read(reader);
                            save(windowStatus, newData);
                            Menu.ClearMenu();
                            System.out.println("enter 0 to return to main menu ");
                            break;
                        case 2:

                            System.out.println("please enter index: ");
                            index = Integer.parseInt(reader.readLine());
                            Doctor doctor = find(windowStatus, index);
                            System.out.println(doctor);
                            System.out.println("enter 0 to return to main menu ");
                            break;
                        case 3:
                            System.out.println("Please enter index of doctor you want to delete: ");
                            index = Integer.parseInt(reader.readLine());
                            delete(windowStatus, index);
                            System.out.println("enter 0 to return to main menu ");

                            break;
                    }

                } else if (currentMenu instanceof AddPatientMenu) {
                    System.out.println("please enter no from menu: ");
                    subMenuStatus = Integer.parseInt((reader.readLine()));
                    switch (subMenuStatus) {
                        case 1:
                            newData = currentMenu.read(reader);
                            save(windowStatus, newData);
                            System.out.println("enter 0 to return to main menu ");
                            break;
                        case 2:

                            System.out.println("please enter index: ");
                            index = Integer.parseInt(reader.readLine());
                            Patients patient = find(windowStatus, index);
                            System.out.println(patient);
                            System.out.println("enter 0 to return to main menu ");
                            break;
                        case 3:
                            System.out.println("Please enter index of patient you want to delete: ");
                            index = Integer.parseInt(reader.readLine());
                            delete(windowStatus, index);
                            System.out.println("enter 0 to return to main menu ");
                            break;
                    }
                } else if (currentMenu instanceof AddMeetingMenu) {
                    System.out.println("please enter no from menu: ");
                    subMenuStatus = Integer.parseInt((reader.readLine()));
                    switch (subMenuStatus) {
                        case 1:
                            newData = currentMenu.read(reader);
                            save(windowStatus, newData);
                            System.out.println("enter 0 to return to main menu ");
                            break;
                        case 2:

                            System.out.println("please enter index: ");
                            index = Integer.parseInt(reader.readLine());
                            Meeting form = find(windowStatus, index);
                            System.out.println(form);
                            System.out.println("enter 0 to return to main menu ");
                            break;
                        case 3:
                            System.out.println("Please enter index of meeting you want to delete: ");
                            index = Integer.parseInt(reader.readLine());
                            delete(windowStatus, index);
                            System.out.println("enter 0 to return to main menu ");
                            break;
                    }
                } else {
                }

                windowStatus = Integer.parseInt(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void save(int windowStatus, Object newData) {
        switch (windowStatus) {
            case MENU_ADD_PATIENT:
                patientService.save((Patients) newData);
                break;
            case MENU_ADD_DOCTOR:
                doctorService.save((Doctor) newData);
                break;
            case MENU_ADD_MEETING:
                meetingService.save((MeetingForm) newData);
                break;
        }
    }

    private static void delete(int windowStatus, int index) {
        switch (windowStatus) {
            case MENU_ADD_PATIENT:
                patientService.deletePatient(index);
                break;
            case MENU_ADD_DOCTOR:
                doctorService.deleteDoctor(index);
                break;
            case MENU_ADD_MEETING:
                meetingService.deleteMeeting(index);
                break;
        }
    }

    private static <T> T find(int windowStatus, int index) {

        if (windowStatus == MENU_ADD_PATIENT) {
            Patients patient = patientService.getPatient(index);
            return (T) patient;
        }
        if (windowStatus == MENU_ADD_DOCTOR) {
            Doctor doctor = doctorService.getDoctor(index);
            return (T) doctor;
        }
        if (windowStatus == MENU_ADD_MEETING) {
            Meeting meeting = meetingService.getMeeting(index);
            return (T) meeting;
        }


        return null;
    }

}
