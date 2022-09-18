package org.healthcare.service;

import org.healthcare.db.Database;
import org.healthcare.model.Doctor;
import org.healthcare.model.Patients;

public class DoctorService {
    private final Database db;

    public DoctorService(Database db) {
        this.db = db;
    }

    public void save(Doctor doctor) {
        db.save(doctor);
    }

    public Doctor getDoctor(int index) {
        Object obj = db.find(index, Doctor.class);
        if (obj == null) return null;
        return (Doctor) obj;
    }


}
