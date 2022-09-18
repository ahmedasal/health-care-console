package org.healthcare.model;

public class Person {
    String  name;
    int age;
    String tel;

    char gender ;

    public Person(){};
    public Person(String name ,int age , String tel ,char gender){
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.gender =gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
