//package org.healthcare.core;
//
//import org.healthcare.model.Doctor;
//import org.healthcare.model.Meeting;
//import org.healthcare.model.Patients;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.math.BigDecimal;
//
//public class Application {
//
//    public enum WindowStatus {
//
//        main_menu(0),
//        add_doctor(1),
//        add_patient(2),
//        add_meeting(3),
//        exit(4);
//
//        private int value = 0;
//
//
//        WindowStatus(int value) {
//            this.value = value;
//        }
//
//        public int getValue() {
//            return value;
//        }
//
//        public static WindowStatus fromValue(int newStatus) {
//            return switch (newStatus) {
//                case 0 -> WindowStatus.main_menu;
//                case 1 -> WindowStatus.add_doctor;
//                case 2 -> WindowStatus.add_patient;
//                case 3 -> WindowStatus.add_meeting;
//                case 4 -> WindowStatus.exit;
//                default -> null;
//            };
//
//        }
//    }
//    public static void main(String[] args) {
//
//        WindowStatus windowStatus = WindowStatus.main_menu;
//        BufferedReader reader = null;
//        int doctorIndex = 0;
//        try {
//            Doctor[] doctors = new Doctor[10];
//            Patients[] patients = new Patients[20];
//            Meeting[] meetings = new Meeting[50];
//            reader = new BufferedReader(new InputStreamReader(System.in));
//
//
////            int [doctorIndex] = 0;
////            doctors[doctorIndex] = new Doctor();
////            doctorIndex++;
//
//            while (true) {
//
//                // clear first
//                clearScreen();
//                // print current menu
//
//                switch (windowStatus) {
//                    case main_menu:
//                        printMainMenu();
//                        break;
//                    case add_doctor:
//                       Doctor doctor = readDoctorMenu(reader);
//                       doctors[doctorIndex] = doctor;
//                       doctorIndex++;
//                        System.out.println(doctor);
//                        System.out.println("Doctor added successfully. Please input 0 to back to the main menu.");
//                        break;
//                }
//                int newStatus = Integer.parseInt( reader.readLine() );
//                windowStatus = WindowStatus.fromValue(newStatus);
//                if(windowStatus == null || windowStatus == WindowStatus.exit) {
//                    return;
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        catch (AhmedException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//
//    }
//
//    public static void clearScreen() {
//
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
////        try {
////            Thread.sleep(300);
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
//
//    }
//
//    public static void printMainMenu() throws AhmedException, IOException{
//            System.out.println(" 1 - Add a new doctor");
//            System.out.println(" 2 - Add a new patient");
//            System.out.println(" 3 - Add a new meeting");
//            System.out.println(" 4 - Exit");
//    }
//
//    public static Doctor readDoctorMenu(BufferedReader reader) throws IOException {
//        Doctor doctor = new Doctor();
//        System.out.println("Input doctor name: ");
//        doctor.setName(reader.readLine());
//        System.out.println("Input doctor specialization: ");
//        doctor.setSpecialization(reader.readLine());
//        System.out.println("Input doctor rate per minute: ");
//        doctor.setRatePerMinute(new BigDecimal(reader.readLine()));
//        return doctor;
//    }
//
//    public static class AhmedException extends Throwable {
//
//    }
//}
