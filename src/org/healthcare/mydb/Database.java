package org.healthcare.mydb;

import org.healthcare.model.Doctor;
import org.healthcare.model.Meeting;
import org.healthcare.model.Patients;

public class Database {
    private int doctorIndex;
    private int patientIndex;
    private int meetingIndex;

    Doctor[] doctors = new Doctor[10];
    Patients[] patients = new Patients[10];
    Meeting[] meetings = new Meeting[10];

    //saving object;
    public void save(Object obj){
        if(obj instanceof Patients){
            patients[patientIndex]= (Patients) obj;
            patientIndex++;
        }
        else if(obj instanceof Doctor){
            doctors[doctorIndex] = (Doctor) obj;
            doctorIndex++;
        }
        else if(obj instanceof Meeting){
            meetings[meetingIndex]= (Meeting) obj;
            meetingIndex++;
        }
        else {
            throw new IllegalArgumentException("Unknown Database Type "+obj.getClass().getSimpleName());
        }
    }


    //find object
    public <T>T find (int index, Class<T> type){
        if (type == Patients.class){
            return (T) patients[index];
        }
       else if (type == Doctor.class){
            return (T) doctors[index];
        }
       else if (type == Meeting.class){
            return (T) meetings[index];
        }
       else{
            throw new IllegalArgumentException("Unknown Database Type "+type.getSimpleName());
        }

    }

    public <T> void delete(int index,Class<T> type){
        if (type == Patients.class){
            deleteMethod(patients, index);
        }
        else if (type == Doctor.class){
            deleteMethod(doctors, index);
        }
        else if (type == Meeting.class){
            deleteMethod(meetings, index);
        }
        else{
            throw new IllegalArgumentException("Unknown Database Type "+type.getSimpleName());
        }


    }




    public <T>void deleteMethod(T[] arr , int index){
        for(int i = index ;i < arr.length;i++){
            if(i == arr.length - 1){
                arr[i] = null;
            }
            else {
                arr[i] = arr[i+1];
            }
        }
    }



}
