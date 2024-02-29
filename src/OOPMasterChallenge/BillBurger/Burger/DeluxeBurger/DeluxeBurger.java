package OOPMasterChallenge.BillBurger.Burger.DeluxeBurger;

import OOPMasterChallenge.BillBurger.Burger.Burger;
import OOPMasterChallenge.BillBurger.Topping;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {

    public DeluxeBurger( double price) {
        super(80.0);
    }

    @Override
    protected void setToppingsList() {
        toppings = new ArrayList<>(5);
    }

    @Override
    protected void addToppingToBurger(Topping topping) {
        if(this.toppings.size()<5){
            this.toppings.add(topping);
        }else System.out.println("Max Toppings reached!");
    }
}
