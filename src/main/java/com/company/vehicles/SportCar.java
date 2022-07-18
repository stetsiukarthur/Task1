package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {

    public String maxSpead;

    public SportCar(){}

    public SportCar( String CarBrand, String CarType, int Weight, Driver Driver, Engine Engine,String maxSpead){
        super(CarBrand,CarType,Weight,Driver,Engine);
        this.maxSpead= maxSpead;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpead='" + maxSpead + '\'' +
                ", Weight=" + Weight +
                ", CarBrand='" + CarBrand + '\'' +
                ", CarType='" + CarType + '\''+
                ",\n Driver=" + Driver +
                ",\n Engine=" + Engine +
                '}';
    }
}

