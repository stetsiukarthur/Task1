package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(" TeslaMotors",300);
        Driver driver = new Driver("Jack Sparrow", "Two years", "Men", 31,234324325);
        Car car = new Car("Tesla","Sedan", 1400, driver, engine );
        SportCar sportCar = new SportCar("Tesla","Sedan", 1400, driver, engine ,"450 km/h");
        Lorry lorry = new Lorry("Tesla","Sedan", 1400, driver, engine ,"21 tons");
        System.out.println(car.toString());
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}
