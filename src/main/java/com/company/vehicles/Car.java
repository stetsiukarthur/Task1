package com.company.vehicles;

import com.company.professions.Driver;
import com.company.details.Engine;

    public class Car {

        private int weight;
        private String carBrand, carType;
        private Driver driver;
        private Engine engine;


        public Car(){}
        public Car(String carBrand, String carType, int weight, Driver driver, Engine engine){
            this.engine = engine;
            this.carBrand = carBrand;
            this.weight = weight;
            this.carType = carType;
            this.driver = driver;
        }

        public  void start(){
            System.out.println("Поїхали");
        }
        public void stop(){
            System.out.println("Зупинились");
        }
        public void turnRight(){
            System.out.println("Повернули праворуч");
        }
        public void turnLeft(){
            System.out.println("Повернули ліворуч");
        }
//        public String toString() {
//
//            return "Car: Driver ("  + Driver.FullName + ", " + Driver.Sex + ", " + Driver.Age + ", "
//                    + Driver.PhoneNumber + ", " + Driver.DrivingExperience + ")" + "\n" +
//                     "Info about car: " + Weight + ", " + CarBrand + ", " + CarType + ", " + Engine.Producer
//                    + ", " + Engine.Power;
//
//        }


        @Override
        public String toString() {
            return "Car{" +
                    "Weight=" + weight +
                    ", CarBrand='" + carBrand + '\'' +
                    ", CarType='" + carType + '\'' +
                    ",\n Driver=" + driver +
                    ",\n Engine=" + engine +
                    '}';
        }

        public void setWeight(int weight){
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
        public void setCarBrand(String carBrand){
            this.carBrand = carBrand;
        }

        public String getCarBrand() {
            return carBrand;
        }
        public void setCarType(String carType){
            this.carType = carType;
        }

        public String getCarType() {
            return carType;
        }
        public void setDriver(Driver driver){
            this.driver = driver;
        }
        public Driver getDriver() {
            return driver;
        }
        public void setEngine(Engine engine){
            this.engine = engine;
        }
        public Engine getEngine() {
            return engine;
        }
    }




