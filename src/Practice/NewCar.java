package Practice;

import com.sun.security.jgss.GSSUtil;

//Description: Create a base class Vehicle. Derive classes Car and Bike from it.
public class NewCar extends Vehicle {
    private String color;
    private String Model;

    public NewCar(String engine, String tyer, String maxSpeed, String cost,String color, String model) {
        super(engine,tyer,maxSpeed,cost);
        this.color = color;
        Model = model;
        this.setTyer("4");
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void showDetails(){
        System.out.println("-------------//---------\nCar info given below:");
        System.out.println(super.getEngine());
        System.out.println(this.getTyer());
        System.out.println(super.getCost());
        System.out.println(this.getMaxSpeed());
        System.out.println(this.getColor());
        System.out.println(this.getModel());
    }
}
