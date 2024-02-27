package Encapsulation.EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = addToner(tonerLevel);
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerLevel + tonerAmount < 0 || tonerLevel + tonerAmount > 100) return -1;
        return tonerLevel += tonerAmount;
    }

    public int printPages(int pagesToBePrinted) {
        if (pagesToBePrinted < 0) {
            System.out.println("Number of pages not valid!");
            return -1;
        }
        int pages = (duplex) ? (pagesToBePrinted / 2) + (pagesToBePrinted % 2) : pagesToBePrinted;
        pagesPrinted+=pages;
        return pages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
