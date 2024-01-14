package Phones;
import java.lang.String;

public class Phone {
    private String name;
    private String type;

    public Phone (String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo(){
        return "Phone Name: " + name + ", type: " + type;
    }
}
