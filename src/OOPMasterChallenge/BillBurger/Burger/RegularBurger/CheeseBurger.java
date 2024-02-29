package OOPMasterChallenge.BillBurger.Burger.RegularBurger;

import OOPMasterChallenge.BillBurger.Burger.Burger;

public class CheeseBurger extends Burger {
    public CheeseBurger(){
        this(8.0);
    }
    private CheeseBurger(double price){
        super(price);
    }
}
