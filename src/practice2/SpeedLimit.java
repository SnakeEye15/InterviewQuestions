package practice2;

/***
 * Objective:
 *
 * Demonstrate how to use constants (public static final variables) in interfaces.
 *
 * 🔶 Steps:
 *
 *
 *
 *
 *
 * Create an interface SpeedLimit with a constant MAX_SPEED = 120.
 *
 *
 *
 * In a class Car, access and print the constant.
 *
 *
 *
 * Do not modify the constant—it should behave like a final value.
 *
 * 🔶 Expected Output:
 *
 * Max Speed is: 120
 */
public interface SpeedLimit {

    public static final int maxSpeed=120;
}

class Car implements SpeedLimit{
    void speed(){
        System.out.println(SpeedLimit.maxSpeed);
    }
}


class main{
    public static void main(String[] args) {
        Car car = new Car(){};
        car.speed();
        System.out.println(SpeedLimit.maxSpeed);
    }
}
