package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {

    private String maxWeight;


    public Lorry(){}
    public Lorry( String CarBrand, String CarType, int Weight, Driver Driver, Engine Engine, String maxWeight){
        super(CarBrand, CarType,Weight,Driver,Engine);
       this.maxWeight = maxWeight;

    }

    @Override
    public String toString() {
        return "Lorry{" +
                "maxWeight=" + maxWeight +
                ", Weight=" + getWeight() +
                ", CarBrand='" + getCarBrand() + '\'' +
                ", CarType='" + getCarType() + '\'' +
                ",\n Driver=" + getDriver() +
                ",\n Engine=" + getEngine() +
                '}';
    }
    public void setMaxWeight(String maxWeight){
        this.maxWeight = maxWeight;
    }
    public String getMaxWeight() {
        return maxWeight;
    }
}

