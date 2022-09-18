package org.healthcare.ui.menu;

import org.healthcare.model.Patients;

import java.io.BufferedReader;
import java.io.IOException;

public class AddPatientMenu implements Menu {
    public static Patients printPatientDoctor(BufferedReader reader) throws IOException {
        Patients patient = new Patients();
        System.out.println("Enter patient name: ");
        patient.setName(reader.readLine());
        System.out.println("Enter patient gender: ");
        char gender = 'M';
        String genderString = reader.readLine();
        if (genderString.length() == 1) {
            gender = genderString.charAt(0);
        }else{
            System.out.println("please enter m or f ");
            genderString = reader.readLine();
            gender = genderString.charAt(0);
        }
        patient.setGender(gender);
        System.out.println("Enter patient age: ");
        int age = Integer.parseInt(reader.readLine());
        patient.setAge(age);
        System.out.println("Enter your complain: ");
        patient.setComplain(reader.readLine());



        return patient;
    }

}
