package com.company.details;

public class Engine {
    private String producer;
    private int power;


    public  Engine (){}

    public  Engine( String producer, int power){
       this.producer = producer;
       this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Producer='" + producer + '\'' +
                ", Power=" + power +
                '}';
    }
    public void setProducer(String producer){
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }
    public void setPower(int power){
        this.power = power;
    }
    public int getPower() {
        return power;
    }
}
