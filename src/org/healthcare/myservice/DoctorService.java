package org.healthcare.myservice;

import org.healthcare.model.Doctor;
import org.healthcare.mydb.Database;

public class DoctorService {
    private final Database db;

    public DoctorService(Database db){
        this.db = db;
    }

    public void save(Doctor doctor){
        db.save(doctor);
    }

    public Doctor getDoctor (int index){
        Object obj = db.find(index,Doctor.class);
        if (obj == null)
            return null;
        return (Doctor) obj;
    }

    public void deleteDoctor(int index){
        db.delete(index, Doctor.class);
    }

}
