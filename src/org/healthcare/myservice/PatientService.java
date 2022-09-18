package org.healthcare.myservice;

import org.healthcare.model.Meeting;
import org.healthcare.model.Patients;
import org.healthcare.mydb.Database;

public class PatientService {
    private final Database db;

    public PatientService(Database db){
        this.db =db;
    }

    public void save(Patients patients){
        db.save(patients);
    }

    public Patients getPatient(int index){
        Object obj  = db.find(index, Patients.class);
        if(obj == null){
            return null;
        }
        return (Patients) obj;
    }
    public void deletePatient(int index){
        db.delete(index, Patients.class);
    }
}
