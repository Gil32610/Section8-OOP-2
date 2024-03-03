package OOPMasterChallenge.Main;

import OOPMasterChallenge.BillBurger.Meal;

public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.selectBurger();
//        meal.selectDrink();
//        meal.selectSideItem();
        meal.printMealSummary();
        meal.orderSummary();
    }
}
