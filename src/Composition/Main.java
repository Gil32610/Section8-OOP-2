package Composition;

public class Main {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2208", "Dell",
                "240");
        Monitor monitor = new Monitor("27inch Beast","Acer"
                ,27, "2540x1440");
        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus",
                4, 6, "v2.44");
        PersonalComputer personalComputer = new PersonalComputer("2208", "Dell",
                computerCase,monitor,motherBoard);

        //To access methods in a composition object interface use getter methods through the Composed Object
//        personalComputer.getMonitor().drawPixelAt(10,10,"Green");
//        personalComputer.getMotherBoard().loadProgram("Ubuntu OS");
//        personalComputer.getComputerCase().pressPowerButton();

        //Creating a WHOLE from different parts
        //Creating objects within objects

        personalComputer.powerUp();

        //Use composition before Inheritance

        //Flexible
        //Functional reuse outside the class hierarchy
        //Inheritance breaks encapsulation

    }
}
