package Composition.CompositionChallenge;

public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private Refrigerator refrigerator;
    private DishWasher dishWasher;

    public SmartKitchen() {
        this.coffeeMaker = new CoffeeMaker();
        this.refrigerator = new Refrigerator();
        this.dishWasher = new DishWasher();
    }

    public void addWater(){
        coffeeMaker.setHasWorkToDo(true);
        System.out.println("Adding water to coffee maker...");
    }

    public void pourMilk(){
        refrigerator.setHasWorkToDo(true);
        System.out.println("Pouring milk on cereal bowl");
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
        System.out.println("Loading dishes on the dish washer...");
    }

    public void setKitchenState(boolean coffeeMakerState, boolean refrigeratorState, boolean dishwasherState){
        coffeeMaker.setHasWorkToDo(coffeeMakerState);
        dishWasher.setHasWorkToDo(dishwasherState);
        refrigerator.setHasWorkToDo(refrigeratorState);
        System.out.println("Adjustments applied to all devices");
    }

    public void doKitchenWork(){
        dishWasher.doDishes();
        refrigerator.orderFood();
        coffeeMaker.brewCoffee();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}
