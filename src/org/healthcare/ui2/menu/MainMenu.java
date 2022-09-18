package org.healthcare.ui2.menu;

import java.io.IOException;

public class MainMenu implements Menu {

    @Override
    public void print(){
        System.out.println(" 1 - For doctor");
        System.out.println(" 2 - For patient");
        System.out.println(" 3 - For meeting");
        System.out.println(" 4 - Exit");
    };


}
