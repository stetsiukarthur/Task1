package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
    public String drivingExperience;

    public Driver (){}

    public Driver (String fullName, String drivingExperience,String sex, int age, int phoneNumber){
        super(sex,fullName,age,phoneNumber);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "Sex='" + sex + '\'' +
                ", FullName='" + fullName + '\'' +
                ", Age=" + age +
                ", PhoneNumber=" + phoneNumber +
                '}';
    }
}
