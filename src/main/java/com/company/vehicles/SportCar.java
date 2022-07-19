package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {

    public String maxSpead;

    public SportCar(){}

    public SportCar( String carBrand, String carType, int weight, Driver driver, Engine engine,String maxSpead){
        super(carBrand,carType,weight,driver,engine);
        this.maxSpead= maxSpead;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpead='" + maxSpead + '\'' +
                ", Weight=" + weight +
                ", CarBrand='" + carBrand + '\'' +
                ", CarType='" + carType + '\''+
                ",\n Driver=" + driver +
                ",\n Engine=" + engine +
                '}';
    }
}

