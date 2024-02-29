package OOPMasterChallenge.BillBurger.Burger.RegularBurger;

import OOPMasterChallenge.BillBurger.Burger.Burger;

public class DoubleCheeseBurger extends Burger {

    public DoubleCheeseBurger(){
        this(12.0);
    }
    private DoubleCheeseBurger(double price){
        super(price);
    }

}
