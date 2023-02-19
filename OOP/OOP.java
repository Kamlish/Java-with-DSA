package JavaWithDSA.OOP;

import java.util.Scanner;

class Car{
    // class variables
    String model;
    String type;
    String color;
    int year;

    // class method
    public void startEngine(){
        System.out.println("Engine Started");
    }

    public void stopEngine(){
        System.out.println("Engine Stopped");
    }

    // Setter Methods
    public void setModel(String model){
        this.model = model;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void setYear(int year){
        this.year = year;
    }

    // Getter Methods
    public String getModel(){
        return model;
    }

    public String getType(){
        return type;
    }

    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }

}

public class OOP {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setModel("Honda City");
        car1.setColor("Black");
        car1.setType("Auto");
        car1.setYear(2012);

        System.out.println(car1.getModel());
        System.out.println(car1.getType());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
        car1.stopEngine();
    }
}
