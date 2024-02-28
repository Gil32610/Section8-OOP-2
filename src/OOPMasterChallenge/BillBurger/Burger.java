package OOPMasterChallenge.BillBurger;

public class Burger {

    private double price;

    private Topping topping1;
    private Topping topping2;
    private Topping topping3;

    public Burger() {
        this(5.0);
    }

    public Burger( double price) {
        this.price = price;
    }


}
