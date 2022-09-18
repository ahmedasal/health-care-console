package org.healthcare.model;

public enum WindowStatus {
    main_menu(0),
    add_doctor(1),
    add_patient(2),
    add_meeting(3),
    exit(4);

    private int value;
    private WindowStatus(int value){this.value = value;}
    public static WindowStatus changeWindowStatus(int newStatus){
        return switch (newStatus) {
            case 0 -> WindowStatus.main_menu;
            case 1 -> WindowStatus.add_doctor;
            case 2 -> WindowStatus.add_patient;
            case 3 -> WindowStatus.add_meeting;
            case 4 -> WindowStatus.exit;
            default -> null;
        };
    }

}
