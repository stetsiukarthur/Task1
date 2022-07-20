package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {

    private String maxSpead;


    public SportCar(){}

    public SportCar( String carBrand, String carType, int weight, Driver driver, Engine engine,String maxSpead){
        super(carBrand,carType,weight,driver,engine);
        this.maxSpead= maxSpead;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpead='" + maxSpead + '\'' +
                ", Weight=" + getWeight() +
                ", CarBrand='" + getCarBrand() + '\'' +
                ", CarType='" + getCarType() + '\''+
                ",\n Driver=" + getDriver() +
                ",\n Engine=" + getEngine() +
                '}';
    }
    public void setMaxSpead(String maxSpead){
        this.maxSpead = maxSpead;
    }
    public String getMaxSpead() {
        return maxSpead;
    }
}

