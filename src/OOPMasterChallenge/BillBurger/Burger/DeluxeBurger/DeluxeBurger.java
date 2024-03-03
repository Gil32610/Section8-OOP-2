package OOPMasterChallenge.BillBurger.Burger.DeluxeBurger;

import OOPMasterChallenge.BillBurger.Burger.Burger;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {

    protected DeluxeBurger(double price) {
        super(80.0);
        setMaxToppings(5);
    }

    @Override
    protected void setMaxToppings(int maxToppings) {
        super.setMaxToppings(maxToppings);
    }

    @Override
    protected void setToppingsList() {
        toppings = new ArrayList<>(5);
    }
}
