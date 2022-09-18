//package org.healthcare.core;
//
//import org.healthcare.model.Doctor;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class App {
//    enum WindowStatus {
//        main_menu(0),
//        add_doctor(1),
//        add_patient(2),
//        add_meeting(3),
//        exit(4);
//
//        private int value;
//        private WindowStatus(int value){
//            this.value = value;
//        }
//
//    }
//    public static WindowStatus fromValue(int newStatus){
//        return switch (newStatus) {
//            case 1 -> WindowStatus.add_doctor;
//            case 2 -> WindowStatus.add_patient;
//            case 3 -> WindowStatus.add_meeting;
//            case 4 -> WindowStatus.exit;
//            default -> null;
//        };
//    }
//
//    public static void main(String[] args) {
//        WindowStatus windowStatus = WindowStatus.main_menu;
//        Doctor[] doctors = new Doctor[10];
//        BufferedReader reader = null;
//
//        while (true){
//            try{
//
//                reader = new BufferedReader(new InputStreamReader(System.in));
//                //clear menu
//                clearScreen();
//
//                int doctorIndex = 0;
//
//
//                //chose from menu
//                switch(windowStatus){
//                    //print menu
//                    case main_menu:
//                        printMenu();
//                    case add_doctor:
//                        Doctor doctor =  printDoctorMenu(reader);
//                        doctors[doctorIndex]=doctor;
//
//                        doctorIndex++;
//                        System.out.println(doctor);
//                        System.out.println("Doctor added succefully press 0 to exit");
//
//
//
//                }
//                int newStatus = Integer.parseInt(reader.readLine());
//
//
//                windowStatus = fromValue(newStatus);
//
//                if (windowStatus == null || windowStatus == WindowStatus.exit)
//                    return;
//
//
//
//
//            }
//            catch(IOException e){
//                e.printStackTrace();
//            }
//        }
//    }
//
//
//
//
//
//
//
//
//
//    public static void printMenu() throws IOException{
//        System.out.println(" 1 - Add a new doctor");
//        System.out.println(" 2 - Add a new patient");
//        System.out.println(" 3 - Add a new meeting");
//        System.out.println(" 4 - Exit");
//    }
//
//
//
//        public static void clearScreen() {
//
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }
//
//
//    public static Doctor printDoctorMenu(BufferedReader reader) throws IOException {
//        Doctor doctor = new Doctor();
//        System.out.println("Enter doctor name :");
//        doctor.setName(reader.readLine());
//        System.out.println("Enter doctor setSpecialization ");
//        doctor.setSpecialization(reader.readLine());
//
//
//
//        return doctor;
//    }
//
//
//
//
//
//
//}
//
//
