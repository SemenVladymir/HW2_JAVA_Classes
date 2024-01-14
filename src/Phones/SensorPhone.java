package Phones;

public class SensorPhone extends Phone {
    private double sizeOfScreen;

    public SensorPhone(String name, double sizeOfScreen){
        super(name, "Phone with sensore screen");
        this.sizeOfScreen = sizeOfScreen;
    }

    public double getSizeOfScreen() {
        return sizeOfScreen;
    }

    public void setSizeOfScreen(double sizeOfScreen) {
        this.sizeOfScreen = sizeOfScreen;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + ", size of screen: " + sizeOfScreen;
    }
}
