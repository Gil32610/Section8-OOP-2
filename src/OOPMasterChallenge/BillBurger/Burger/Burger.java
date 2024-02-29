package OOPMasterChallenge.BillBurger.Burger;

import OOPMasterChallenge.BillBurger.Topping;

import java.util.ArrayList;

public class Burger {

    private double price;

    protected ArrayList<Topping> toppings;
    public Burger() {
        this(5.0);
    }

    protected Burger(double price) {
        this.price = price;
        setToppingsList();
    }

    protected void setToppingsList(){
        this.toppings = new ArrayList<>(3);
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void addTopping(Topping topping){
        addToppingToBurger(topping);
    }

    protected void addToppingToBurger(Topping topping){
        if(this.toppings.size()<3){
            toppings.add(topping);
        }else{
            System.out.println("Max Toppings reached!");
        }
    }

    @Override
    public String toString() {
        return String.format("%s: $%2.f %n") + toppings;
    }
}
