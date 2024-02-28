package Polymorphism.PolymorphismChallenge.CarClass;

public class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Pumping fuel to engine....");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("The fuel is being consumed by the engine");
    }

    public void travel(double distance){
       System.out.printf("You traveled %fKm and spent %fL of fuel", distance, distance/avgKmPerLitre);
   }
}
