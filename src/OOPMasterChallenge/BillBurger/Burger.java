package OOPMasterChallenge.BillBurger;

public class Burger {

    private String type;
    private double price;

    private Topping topping1;
    private Topping topping2;
    private Topping topping3;

    public Burger() {
        this("Regular Burger", 5.0);
    }

    public Burger(String type, double price) {
        this.type = type;
        this.price = price;
    }


}
