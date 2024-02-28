package Polymorphism.PolymorphismChallenge.CarClass;

public class Car {
    private String description;
    private boolean isEngineStarted;


    public Car(String description) {
        this.description = description;
    }

//    public static Car getCar(String type, String description){
//
//        return switch(type.toUpperCase().charAt(0)){
//            "G" -> new
//            default -> new Car(description);
//        };
//    }

    public void startEngine() {
        isEngineStarted = true;
        System.out.println("The engine has been started!");
    }

    public void shutEngineOff() {
        isEngineStarted = false;
        System.out.println("The engine has been turned off");
    }

    public void drive() {
        if (isEngineStarted) {
            runEngine();
        } else {
            System.out.println("The engine is turned off!");
        }
    }

    protected void runEngine() {
        System.out.println(this.getClass().getSimpleName() + ": " + description + " engine is now Running");
    }

}
