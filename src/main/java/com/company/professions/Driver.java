package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
    public String DrivingExperience;

    public Driver (){}

    public Driver (String FullName, String DrivingExperience,String Sex, int Age, int PhoneNumber){
        super(Sex,FullName,Age,PhoneNumber);
        this.DrivingExperience = DrivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "Sex='" + Sex + '\'' +
                ", FullName='" + FullName + '\'' +
                ", Age=" + Age +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}
