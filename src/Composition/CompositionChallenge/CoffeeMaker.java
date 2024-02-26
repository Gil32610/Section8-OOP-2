package Composition.CompositionChallenge;

public class CoffeeMaker extends Appliance{

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing coffee...");
            hasWorkToDo=false;
        }else System.out.println("Coffee container empty");
    }
}
