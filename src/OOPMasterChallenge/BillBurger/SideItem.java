package OOPMasterChallenge.BillBurger;

public class SideItem {
    private double price;

    protected SideItem(double price){
       this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Fries extends SideItem{

    public Fries(){
        this(4.5);
    }
    private Fries(double price){
        super(price);
    }
}

class OnionRing extends SideItem{
    public OnionRing(){
        this(2.00);
    }
    private OnionRing(double price){
        super(price);
    }
}

class Cookies extends SideItem{
    public Cookies(){
        this(5.0);
    }
    private Cookies(double price){
        super(price);
    }
}
