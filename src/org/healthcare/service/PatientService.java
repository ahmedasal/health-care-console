package org.healthcare.service;

import org.healthcare.mydb.Database;
import org.healthcare.model.Doctor;
import org.healthcare.model.Patients;

public class PatientService {

    private final Database db;

    public PatientService(Database db) {
        this.db = db;
    }

    public void save(Patients patients) {
        db.save(patients);
    }

    public Patients getPatient(int index) {
        Object obj = db.find(index, Patients.class);
        if(obj == null) return null;
        return (Patients) obj;
    }
    public void deleteDoctor(int index){
        db.delete(index, Patients.class);
    }
}
