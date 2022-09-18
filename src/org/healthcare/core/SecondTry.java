//package org.healthcare.core;
//
//import org.healthcare.model.Doctor;
//
//import javax.print.Doc;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.math.BigDecimal;
//
//public class SecondTry {
//
//    enum WindowStatus{
//        main_menu(0),
//        add_doctor(1),
//        add_patient(2),
//        add_meeting(3),
//        exit(4);
//
//        private int value;
//        WindowStatus(int value){this.value = value;}
//
//    }
//
//    public static WindowStatus StatusValue(int newStatus){
//        return switch (newStatus) {
//            case 0 -> WindowStatus.main_menu;
//            case 1 -> WindowStatus.add_doctor;
//            case 2 -> WindowStatus.add_patient;
//            case 3 -> WindowStatus.add_meeting;
//            case 4 -> WindowStatus.exit;
//            default -> null;
//        };
//
//    }
//
//
//    public static void main(String[] args) {
//        WindowStatus windowStatus = WindowStatus.main_menu;
//
//        Doctor[] doctors = new Doctor[10];
//        int doctorIndex = 0;
//
//        try{
//           while(true){
//               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            clearScreen();
//
//            switch(windowStatus) {
//                case main_menu:
//                    printMainMenu();
//                    break;
//                case add_doctor:
//                    Doctor doctor = printDoctorMenu(reader);
//                    doctors[doctorIndex]=doctor;
//                    doctorIndex++;
//                    System.out.println(doctor);
//                    System.out.println("Doctor added successfully , please Enter 0 to exit");
//                    break;
//                case add_patient:
//                case add_meeting:
//
//
//            }
//            int newStatus = Integer.parseInt(reader.readLine());
//            windowStatus = StatusValue(newStatus);
//
//
//            if (windowStatus == null || windowStatus == WindowStatus.exit){
//                return;
//            }
//
//
//           }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void printMainMenu() throws IOException{
//        System.out.println(" 1 - Add a new doctor");
//        System.out.println(" 2 - Add a new patient");
//        System.out.println(" 3 - Add a new meeting");
//        System.out.println(" 4 - Exit");
//    }
//    public static void clearScreen() {
//
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }
//
//
//    public static Doctor printDoctorMenu (BufferedReader reader) throws IOException{
//        Doctor doctor = new Doctor();
//        System.out.println("Enter doctor name : ");
//        doctor.setName(reader.readLine());
//        System.out.println("Enter doctor rate per minute :");
//        doctor.setRatePerMinute(new BigDecimal(reader.readLine()));
//
//        return doctor;
//
//    }
//
//
//}
