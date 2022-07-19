package com.company.details;

public class Engine {
    public String producer;
    public int power;

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
}
