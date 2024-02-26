package Composition.CompositionChallenge;

public class Main {
    public static void main(String[] args) {
//        DishWasher dishWasher = new DishWasher();
//        Refrigerator refrigerator = new Refrigerator();
//        CoffeeMaker coffeeMaker = new CoffeeMaker();
        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.pourMilk();
        smartKitchen.addWater();
        smartKitchen.loadDishWasher();

        smartKitchen.getRefrigerator().orderFood();
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getDishWasher().doDishes();

        smartKitchen.setKitchenState(false, true, true);

        smartKitchen.doKitchenWork();

    }
}
