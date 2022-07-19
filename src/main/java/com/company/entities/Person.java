package com.company.entities;

public class Person {
    public String sex, fullName;
    public int age, phoneNumber;
    public Person(){}

    public Person(String sex,String fullName, int age, int phoneNumber){
        this.age = age;
        this.sex = sex;
        this.fullName = fullName;
        this.phoneNumber =  phoneNumber;

    }
}
