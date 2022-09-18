package org.healthcare.myservice;

import org.healthcare.model.Doctor;
import org.healthcare.model.Meeting;
import org.healthcare.model.Patients;
import org.healthcare.mydb.Database;
import org.healthcare.ui2.form.MeetingForm;

public class MeetingService {
    private final Database db;

    public MeetingService(Database db) {
        this.db = db;
    }

    public void save(MeetingForm form){
        Meeting meeting = form.toMeeting();
        Patients patients = db.find(form.getPatientIndex(), Patients.class);
        meeting.setPatient(patients);
        Doctor doctor = db.find(form.getDoctorIndex(), Doctor.class);
        meeting.setDoctor(doctor);

        db.save(meeting);

    }

    public Meeting getMeeting(int index){
        Object obj = db.find(index, Meeting.class);
        if(obj == null){return null;}
        return (Meeting) obj;

    }
    public void deleteMeeting(int index){
        db.delete(index, Meeting.class);
    }



}
