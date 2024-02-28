package Polymorphism.PolymorphismChallenge;

import Polymorphism.PolymorphismChallenge.CarClass.Car;
import Polymorphism.PolymorphismChallenge.CarClass.GasPoweredCar;
import Polymorphism.PolymorphismChallenge.CarClass.HybridCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Red car");
        Car hybridCar = new HybridCar("Porsche",10.0,5000,12);
        Car gasPoweredCar = new GasPoweredCar("Ferrari", 6,12);
        Car[] cars = {hybridCar,gasPoweredCar,car};
        for(Car vehicle: cars){
            runRace(vehicle);
        }
    }

    public static void runRace(Car car){
        car.drive();
        car.startEngine();
        car.drive();
        car.shutEngineOff();
    }
}
