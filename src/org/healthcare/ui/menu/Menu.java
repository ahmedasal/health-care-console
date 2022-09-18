package org.healthcare.ui.menu;

import org.healthcare.model.Doctor;
import org.healthcare.model.Meeting;
import org.healthcare.model.Patients;

import java.io.BufferedReader;
import java.io.IOException;

public interface Menu {
    public static void printMainMenu()throws IOException{};

    public static Doctor printDoctorMenu(BufferedReader reader) throws IOException {
        return null;
    }

    public static Patients printPatientDoctor(BufferedReader reader) {
        return null;
    }

    public static Meeting printMeetingMenu(BufferedReader reader ,Doctor doctor ,Patients patient) {
        return null;
    }

    public static void ClearMenu (){
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}
