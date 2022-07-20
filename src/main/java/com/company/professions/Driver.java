package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
    private String drivingExperience;


    public Driver (){}

    public Driver (String fullName, String drivingExperience,String sex, int age, int phoneNumber){
        super(sex,fullName,age,phoneNumber);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "Sex='" + getSex()  + '\'' +
                ", FullName='" + getFullName() + '\'' +
                ", Age=" + getAge()  +
                ", PhoneNumber=" + getPhoneNumber()  +
                ", DrivingExperience=" + drivingExperience +
                '}';
    }
    public void setDrivingExperience(String drivingExperience){
        this.drivingExperience = drivingExperience;
    }
    public String getDrivingExperience() {
        return drivingExperience;
    }
}
