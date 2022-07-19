package com.company.vehicles;

import com.company.professions.Driver;
import com.company.details.Engine;

    public class Car {

        public int weight;
        public String carBrand, carType;
        public Driver driver;
        public Engine engine;

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
    }




