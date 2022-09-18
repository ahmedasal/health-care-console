package org.healthcare.ui.menu;

import java.io.IOException;

public class MainMenu implements Menu {

    public static void printMainMenu()throws IOException{
        System.out.println(" 1 - Add a new doctor");
        System.out.println(" 2 - Add a new patient");
        System.out.println(" 3 - Add a new meeting");
        System.out.println(" 4 - Exit");
    };


}
