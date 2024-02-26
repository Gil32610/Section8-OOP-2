package Composition.CompositionChallenge;

public class DishWasher extends Appliance{

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Cleaning and Washing dishes");
            hasWorkToDo=false;
        }else System.out.println("No dishes to be washed");

    }
}
