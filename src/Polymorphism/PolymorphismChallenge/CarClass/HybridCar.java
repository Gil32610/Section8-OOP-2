package Polymorphism.PolymorphismChallenge.CarClass;

public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Pumping fuel to engine and charging batteries!");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("The fuel is being consumed by the engine and the batteries are being charged");
    }
}
