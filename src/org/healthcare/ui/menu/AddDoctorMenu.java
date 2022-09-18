package org.healthcare.ui.menu;


import org.healthcare.model.Doctor;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;

public class AddDoctorMenu implements Menu {

    Doctor doctor = new Doctor();
    public static Doctor printDoctorMenu(BufferedReader reader) throws IOException {
        Doctor doctor = new Doctor();
        System.out.println("Enter doctor Name: ");
        doctor.setName(reader.readLine());
        System.out.println("Enter Specialization of doctor: ");
        doctor.setSpecialization(reader.readLine());
        System.out.println("Enter doctor rate: ");
        doctor.setRatePerMinute(new BigDecimal(reader.readLine()));

        System.out.println("Enter doctor gender: ");
        char gender = 'M';
        String genderString = reader.readLine();
        if (genderString.length() == 1) {
            gender = genderString.charAt(0);
        }else{
            System.out.println("please enter m or f ");
           genderString = reader.readLine();
            gender = genderString.charAt(0);
        }
        doctor.setGender(gender);
        return doctor;
    }
}
