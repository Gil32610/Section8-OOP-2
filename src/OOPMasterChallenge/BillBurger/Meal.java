package OOPMasterChallenge.BillBurger;

import OOPMasterChallenge.BillBurger.Burger.Burger;
import OOPMasterChallenge.BillBurger.Burger.DeluxeBurger.DeluxeBurger;

import java.util.ArrayList;
import java.util.Scanner;

public class Meal {
    Burger burger;
    Drink drink;
    SideItem sideItem;

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public void printMealSummary() {

    }

    public void addToppings() {
        Scanner s = new Scanner(System.in);
        char option;
        int count = 1;
        do {
            System.out.printf("Select topping #%d:%n", count);
            System.out.println("(Cheese) (Bacon) (Meat) (Onions)");
            option = Character.toUpperCase(s.nextLine().charAt(0));
            switch (option) {
                case 'C' -> burger.addTopping(new Cheese());
                case 'B' -> burger.addTopping(new Bacon());
                case 'M' -> burger.addTopping(new Meat());
                case 'O' -> burger.addTopping(new Onion());
                case 'Q' -> System.out.println("Toppings added!");
                default -> System.out.println("Invalid Option!");
            }
            count++;
        } while (option != 'Q');
        s.close();
    }

    public void selectBurger() {
        System.out.println("""
                Select Burger:
                M = (Regular Meal) R = (Regular Burger) C = (Cheeseburger) D = (Double cheeseburger) B = (Bacon cheeseburger)
                A = (Deluxe Astro Burger) S = (Deluxe Super Burger)""");
        char option;
        do{
            option = 'a';

        }while(option!='Q');
        switch(option){

        }
    }

    public void selectDrink() {

    }

    public void changeSizeOfDrink() {
        Scanner s = new Scanner(System.in);
        char size;
        do {
            System.out.println("""
                    Insert desired size of drink or Q to quit:
                    (Small) (Medium) (Large)""");
            size = Character.toUpperCase(s.nextLine().charAt(0));
            switch (size) {
                case 'S' -> drink.changeDrinkPrice(Size.SMALL);
                case 'M' -> drink.changeDrinkPrice(Size.MEDIUM);
                case 'L' -> drink.changeDrinkPrice(Size.LARGE);
                case 'Q' -> System.out.println("No change was applied!");
                default -> System.out.println("Invalid option!");
            }
        } while (size != 'q');
        System.out.println("Operation concluded");
    }

    public void orderSummary() {
        System.out.println(burger);
        System.out.println(drink);
        System.out.println(sideItem);
        System.out.printf("Total price for the Meal: $%2.f%n",calculateTotalAmount());
    }

    private double calculateTotalAmount() {
        double totalAmount;
        if (this.burger instanceof DeluxeBurger deluxeBurger) {
            totalAmount = deluxeBurger.getPrice();
            return totalAmount;
        }
        totalAmount = burger.getPrice() + sideItem.getPrice() + drink.getPrice() + calculateTotalToppings();
        return totalAmount;
    }

    private double calculateTotalToppings() {
        double toppingsTotalAmount = 0;
        ArrayList<Topping>toppings = burger.getToppings();
        for (int i = 0; i < toppings.size(); i++) {
            toppingsTotalAmount += toppings.get(i).getPrice();
        }
        return toppingsTotalAmount;
    }
}
