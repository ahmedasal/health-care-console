package org.healthcare.db;

import org.healthcare.model.Doctor;
import org.healthcare.model.Meeting;
import org.healthcare.model.Patients;

public class Database {
    private int doctorIndex;
    private int patientIndex;
    private int meetingIndex;

    private final static Doctor[] doctors = new Doctor[10];
    private final static Patients[] patients = new Patients[10];
    private final static Meeting[] meetings = new Meeting[10];

    public void save(Object obj) {
        if (obj instanceof Doctor) {
            doctors[doctorIndex] = (Doctor) obj;
            doctorIndex++;
        } else if (obj instanceof Patients) {
            patients[patientIndex] = (Patients) obj;
            patientIndex++;
        }
        else if(obj instanceof Meeting){
            meetings[meetingIndex]=(Meeting)obj;
            meetingIndex++;
        }
        else{
            throw new IllegalArgumentException("Unknown Database Type "+obj.getClass().getSimpleName());
        }
    }

    public <T> T find(int index, Class<T> type) {
        if(type == Patients.class) {
            return (T) patients[index];
        }
        else if(type == Doctor.class) {
            return (T) doctors[index];
        }
        else if(type == Meeting.class) {
            return (T) meetings[index];
        }
        else{
            throw new IllegalArgumentException("Unknown Database Type "+type.getSimpleName());
        }
    }

}