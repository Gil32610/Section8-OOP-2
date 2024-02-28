package Polymorphism.PolymorphismChallenge;

import Polymorphism.PolymorphismChallenge.CarClass.Car;
import Polymorphism.PolymorphismChallenge.CarClass.GasPoweredCar;
import Polymorphism.PolymorphismChallenge.CarClass.HybridCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Red car");
        car.drive();
        car.startEngine();
        car.drive();

        HybridCar hybridCar = new HybridCar("Porsche",10.0,5000,12);
        hybridCar.drive();
        hybridCar.startEngine();
        hybridCar.drive();
        hybridCar.shutEngineOff();

        GasPoweredCar gasPoweredCar = new GasPoweredCar("Ferrari", 6,12);
        gasPoweredCar.drive();
        gasPoweredCar.startEngine();
        gasPoweredCar.drive();
        gasPoweredCar.shutEngineOff();
    }
}
