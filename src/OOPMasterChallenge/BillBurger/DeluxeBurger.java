package OOPMasterChallenge.BillBurger;

import java.util.ArrayList;

public class DeluxeBurger extends Burger{

    public DeluxeBurger( double price) {
        super(80.0);
    }

    @Override
    protected void setToppingsList() {
        toppings = new ArrayList<>(5);
    }


}
