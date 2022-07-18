package com.company.entities;

public class Person {
    public String Sex , FullName;
    public int Age, PhoneNumber;
    public Person(){}

    public Person(String Sex,String FullName, int Age, int PhoneNumber){
        this.Age = Age;
        this.Sex = Sex;
        this.FullName = FullName;
        this.PhoneNumber =  PhoneNumber;

    }
}
