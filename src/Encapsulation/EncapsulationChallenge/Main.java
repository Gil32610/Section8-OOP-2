package Encapsulation.EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(300, true);
        System.out.println("Printing " + printer.printPages(41) + " Pages");
        printer.setDuplex(false);
        System.out.println("Printing " + printer.printPages(23) + " Pages");
        System.out.println("Total of pages printed is: " + printer.getPagesPrinted());
        System.out.println("Toner level is " + printer.getTonerLevel());

    }
}
