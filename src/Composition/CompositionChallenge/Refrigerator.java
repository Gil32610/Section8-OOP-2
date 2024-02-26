package Composition.CompositionChallenge;

public class Refrigerator extends Appliance{

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Checking refrigerator items and ordering food supplies from super market");
            hasWorkToDo=false;
        }else System.out.println("No items to be ordered");
    }
}
