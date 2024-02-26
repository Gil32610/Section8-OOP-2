package Composition;

public class PersonalComputer extends Product{

    //Composition is a HAS A relationship
    //Contrast to inheritance, combination of classes
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "GREEN");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }
}
