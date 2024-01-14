package Phones;

public class ButtonsPhone extends Phone {
    private int yearMade;
    public ButtonsPhone(String name, int yearMade){
        super(name, "Phone with buttons");
        this.yearMade = yearMade;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + ", year of made: " + yearMade;
    }
}
