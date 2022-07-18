package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {

    public String maxWeight;

    public Lorry(){}
    public Lorry( String CarBrand, String CarType, int Weight, Driver Driver, Engine Engine, String maxWeight){
        super(CarBrand, CarType,Weight,Driver,Engine);
       this.maxWeight = maxWeight;

    }

    @Override
    public String toString() {
        return "Lorry{" +
                "maxWeight=" + maxWeight +
                ", Weight=" + Weight +
                ", CarBrand='" + CarBrand + '\'' +
                ", CarType='" + CarType + '\'' +
                ",\n Driver=" + Driver +
                ",\n Engine=" + Engine +
                '}';
    }
}

