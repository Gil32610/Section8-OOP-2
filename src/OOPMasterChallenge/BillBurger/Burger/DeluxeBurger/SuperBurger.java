package OOPMasterChallenge.BillBurger.Burger.DeluxeBurger;

public class SuperBurger extends DeluxeBurger{
    public SuperBurger(){
        this(70.00);
    }
    private SuperBurger(double price) {
        super(price);
    }
}
