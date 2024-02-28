package OOPMasterChallenge.BillBurger;

public class Drink {
    private String type;
    private Size size;
    private double price;

    public Drink() {
        this("Coke", Size.SMALL);
    }

    public Drink(String type, Size size) {
        this.type = type;
        this.size = size;
        this.price = 0.0;
    }

    protected void changeDrinkPrice(Size size) {
        switch (size) {
            case SMALL -> price = 3.0;
            case MEDIUM -> price = 5.0;
            case LARGE -> price = 8.0;
            default -> price = 0;
        }
    }
}

class Coke extends Drink {
    public Coke(String type, Size size) {
        super(type, size);
    }
}
