package Practice;
//Description: Create a base class Vehicle. Derive classes Car and Bike from it.
public class Vehicle {
    private String engine;
    private String tyer;
    private String maxSpeed;
    private String cost;


    public Vehicle(String engine, String tyer, String maxSpeed, String cost) {
        this.engine = engine;
        this.tyer = tyer;
        this.maxSpeed = maxSpeed;
        this.cost = cost;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTyer() {
        return tyer;
    }

    public void setTyer(String tyer) {
        this.tyer = tyer;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
