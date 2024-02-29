package OOPMasterChallenge.BillBurger;

public class Topping {
    private double price;

    protected Topping(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": $"+ this.price;
    }
}

class Cheese extends Topping{

    public Cheese(){
        this(1.00);
    }
    private Cheese(double price) {
        super(price);
    }
}

class Bacon extends Topping{
    public Bacon(){
        this(2.5);
    }
    private Bacon(double price) {
        super(price);
    }
}

class Onion extends Topping{
    public Onion(){
        this(0.5);
    }
    private Onion(double price){
        super(price);
    }
}

class Meat extends Topping{
    public Meat(){
        this(0.5);
    }
    private Meat(double price){
        super(price);
    }
}
