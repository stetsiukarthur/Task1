package com.company.details;

public class Engine {
    public String Producer;
    public int Power;

    public  Engine (){}

    public  Engine( String Producer, int Power){
       this.Producer = Producer;
       this.Power = Power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Producer='" + Producer + '\'' +
                ", Power=" + Power +
                '}';
    }
}
