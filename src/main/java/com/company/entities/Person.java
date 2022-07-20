package com.company.entities;

public class Person {
    private String sex, fullName;
    private int age, phoneNumber;

    public Person(){}

    public Person(String sex,String fullName, int age, int phoneNumber){
        this.age = age;
        this.sex = sex;
        this.fullName = fullName;
        this.phoneNumber =  phoneNumber;

    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public  int getPhoneNumber(){
        return phoneNumber;
    }
}
