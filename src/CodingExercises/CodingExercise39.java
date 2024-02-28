package CodingExercises;

class Printer{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = ((tonerLevel<0)?(tonerLevel<=100?tonerLevel:-1):-1);
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>100||tonerAmount<0)return-1;
        return (tonerLevel+tonerAmount<=100)? tonerLevel+= tonerAmount:-1;
    }

    public int printPages(int pagesToPrint){
        int pages = (duplex)?(pagesToPrint/2)+(pagesToPrint%2):pagesToPrint;
        pagesPrinted+=pages;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

class Testing{
    public static void main(String[] args) {
        Printer printer = new Printer(40,false);
    }
}
