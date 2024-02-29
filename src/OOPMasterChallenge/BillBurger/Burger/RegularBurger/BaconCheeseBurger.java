package OOPMasterChallenge.BillBurger.Burger.RegularBurger;

import OOPMasterChallenge.BillBurger.Burger.Burger;

public class BaconCheeseBurger extends Burger {

    public BaconCheeseBurger(){
        this(14.0);
    }
    private BaconCheeseBurger(double price){
        super(price);
    }
}
