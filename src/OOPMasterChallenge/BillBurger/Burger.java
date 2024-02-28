package OOPMasterChallenge.BillBurger;

import java.util.ArrayList;

public class Burger {

    private double price;

    protected ArrayList<Topping> toppings;
    public Burger() {
        this(5.0);
    }

    public Burger( double price) {
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
}
