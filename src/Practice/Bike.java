package Practice;

public class Bike extends Vehicle {
    private String color;
    private String Model;

    public Bike(String engine, String tyer, String maxSpeed, String cost, String color, String model) {
        super(engine, tyer, maxSpeed, cost);
        this.color = color;
        Model = model;
        this.setTyer("2");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    void showDetails(){
        System.out.println("-------------//---------\nBike info given below:");
        System.out.println(super.getEngine());
        System.out.println(this.getTyer());
        System.out.println(super.getCost());
        System.out.println(this.getMaxSpeed());
        System.out.println(this.getColor());
        System.out.println(this.getModel());
    }
}
