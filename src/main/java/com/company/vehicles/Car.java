package com.company.vehicles;

import com.company.professions.Driver;
import com.company.details.Engine;

    public class Car {

        public int Weight;
        public String CarBrand, CarType;
        public Driver Driver;
        public Engine Engine;

        public Car(){}
        public Car(String CarBrand, String CarType, int Weight, Driver Driver, Engine Engine){
            this.Engine = Engine;
            this.CarBrand = CarBrand;
            this.Weight = Weight;
            this.CarType = CarType;
            this.Driver = Driver;
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
                    "Weight=" + Weight +
                    ", CarBrand='" + CarBrand + '\'' +
                    ", CarType='" + CarType + '\'' +
                    ",\n Driver=" + Driver +
                    ",\n Engine=" + Engine +
                    '}';
        }
    }




