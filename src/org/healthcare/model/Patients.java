package org.healthcare.model;

public class Patients extends Person {
    String maritalStatus;
    Address address;
    String complain;

    public Patients(){};
    Patients(String name ,int age , String tel ,char gender , String material_status, Address address, String illness){
        super(name,age,tel,gender);
        this.maritalStatus = material_status;
        this.address =address;
        this.complain = illness;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }





    @Override
    public String toString() {
        return "Patients{" +
                "complain='" + complain + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
