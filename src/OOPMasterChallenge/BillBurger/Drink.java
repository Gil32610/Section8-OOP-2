package OOPMasterChallenge.BillBurger;

public class Drink {
    private Size size;
    protected double price;

    public Drink() {
        this(Size.SMALL);
    }

    public Drink(Size size) {
        this.size = size;
        changeDrinkPrice(size);
    }

    public double getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }

    protected void changeDrinkPrice(Size size) {
        switch (size) {
            case SMALL -> price = 1.5;
            case MEDIUM -> price = 3.0;
            case LARGE -> price = 5.5;
        }


    }

    @Override
    public String toString() {
        return String.format("%s %s: $%2.f",size,getClass().getSimpleName());
    }
}

class Coke extends Drink {

    public Coke(Size size) {
        super(size);
    }
    @Override
    protected void changeDrinkPrice(Size size) {
        switch (size){
            case SMALL -> price = 3.00;
            case MEDIUM -> price = 5.00;
            case LARGE -> price = 8.0;
        }
    }
}

class OranjeJuice extends Drink{
    public OranjeJuice(Size size) {
        super(size);
    }

    @Override
    protected void changeDrinkPrice(Size size) {
        switch (size){
            case SMALL -> price = 2.50;
            case MEDIUM -> price = 4.00;
            case LARGE -> price = 7.0;
        }
    }
}
