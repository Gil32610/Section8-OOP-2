package OOPMasterChallenge.BillBurger;

import OOPMasterChallenge.BillBurger.Burger.Burger;
import OOPMasterChallenge.BillBurger.Burger.DeluxeBurger.AstroBurger;
import OOPMasterChallenge.BillBurger.Burger.DeluxeBurger.DeluxeBurger;
import OOPMasterChallenge.BillBurger.Burger.DeluxeBurger.SuperBurger;
import OOPMasterChallenge.BillBurger.Burger.RegularBurger.BaconCheeseBurger;
import OOPMasterChallenge.BillBurger.Burger.RegularBurger.CheeseBurger;
import OOPMasterChallenge.BillBurger.Burger.RegularBurger.DoubleCheeseBurger;

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
        System.out.println(burger);
        System.out.println(drink);
        System.out.println(sideItem);
    }

    private void addToppings() throws RuntimeException{
        if(burger==null){
            throw new RuntimeException();
        }
        Scanner s = new Scanner(System.in);
        char option;
        do {
            System.out.printf("Select topping #%d:%n", burger.getToppingsSize()+1);
            System.out.println("(Cheese) (Bacon) (Meat) (Onions)");
            System.out.println("Press F to finish");
            option = Character.toUpperCase(s.nextLine().charAt(0));
            switch (option) {
                case 'C' -> burger.addTopping(new Cheese());
                case 'B' -> burger.addTopping(new Bacon());
                case 'M' -> burger.addTopping(new Meat());
                case 'O' -> burger.addTopping(new Onion());
                case 'F' -> System.out.println("Toppings added!");
                default -> System.out.println("Invalid Option!");
            }
        } while (burger.getToppingsSize() < burger.getMaxToppings() &&option != 'F');
    }

    public void selectBurger() {
        Scanner s = new Scanner(System.in);
        char option;
            do{
                System.out.println("""
                Select Burger or press 'F' to Add burger to the meal:
                R = (Regular Burger) C = (Cheeseburger) D = (Double cheeseburger) B = (Bacon cheeseburger)
                A = (Deluxe Astro Burger) S = (Deluxe Super Burger)
                Press 'M' for a regular meal""");
                option = Character.toUpperCase(s.nextLine().charAt(0));
                switch (option) {
                    case 'R' -> burger = new Burger() ;
                    case 'C' -> burger = new CheeseBurger();
                    case 'D' -> burger = new DoubleCheeseBurger();
                    case 'B' -> burger = new BaconCheeseBurger();
                    case 'A' -> burger = new AstroBurger();
                    case 'S' -> burger = new SuperBurger();
                    case 'F' -> System.out.println("Selection completed");
                    case 'M' -> regularMeal();
                    default -> System.out.println("Invalid option!");
                }
            }while (option!= 'F');
        try{
            addToppings();
        }catch(RuntimeException np){
            System.out.println("No burger was selected!");
            selectBurger();
        }

    }

    public void selectDrink() {
        Scanner s = new Scanner(System.in);
        char option;
        do {
            System.out.println("""
                Select Drink or Press 'Q' to add drink to Meal:
                C = (Coke) O = (Orange Juice) R = (Regular Pop) Q = (Quit)""");
            option = Character.toUpperCase(s.nextLine().charAt(0));
            switch (option) {
                case 'C' -> {
                    this.drink = new Coke();
                    changeSizeOfDrink();
                }
                case 'O' -> {
                    this.drink = new OrangeJuice();
                    changeSizeOfDrink();
                }
                case 'R' -> {
                    this.drink = new Drink();
                    changeSizeOfDrink();
                }
                case 'Q' ->{
                    System.out.println("Drink added to meal!");
                }
            }
        } while (option != 'Q');
    }
    public void selectSideItem(){
        Scanner s = new Scanner(System.in);
        char option;
        do{
            System.out.println("""
                Select Side Item:
                C = (Cookies) F = (Fries) O = (Onion Rings)
                Press Q to finish and add the side item to meal""");
            option = Character.toUpperCase(s.nextLine().charAt(0));
            switch (option) {
                case 'C' -> sideItem = new Cookies();
                case 'O' -> sideItem = new OnionRing();
                case 'F' -> sideItem = new Fries();
                case 'Q' -> System.out.println("Side Item added to meal!");
                default -> System.out.println("Invalid option!");
            }
        }while (option!= 'Q');
        System.out.println("Operation concluded");
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
                case 'S' -> drink.changeSizeOfDrink(Size.SMALL);
                case 'M' -> drink.changeSizeOfDrink(Size.MEDIUM);
                case 'L' -> drink.changeSizeOfDrink(Size.LARGE);
                case 'Q' -> System.out.println("Drink added to meal!");
                default -> System.out.println("Invalid option!");
            }
        } while (size != 'Q');
        System.out.println("Operation concluded");
    }

    private void regularMeal(){
        burger = new Burger();
        drink = new Drink();
        sideItem = new Fries();
        System.out.println("Regular Meal selected!");
    }

    public void orderSummary() {
        System.out.println(burger);
        System.out.println(drink);
        System.out.println(sideItem);
        System.out.printf("Total price for the Meal: $%.2f%n", calculateTotalAmount());
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
        ArrayList<Topping> toppings = burger.getToppings();
        for (int i = 0; i < toppings.size(); i++) {
            toppingsTotalAmount += toppings.get(i).getPrice();
        }
        return toppingsTotalAmount;
    }
}
