package Polymorphism.PolymorphismChallenge.CarClass;

public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Battery is now powering the motor");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("The motor is now consuming the batteries power");
    }
}
