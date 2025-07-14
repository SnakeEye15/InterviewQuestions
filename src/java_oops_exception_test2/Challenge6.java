package java_oops_exception_test2;

import java.util.Vector;

/***
 * Vehicle Inheritance Hierarchy
 * Create a Vehicle base class with start() method. Create Car and Bike subclasses that override the start() method.
 *
 * Examples:
 * Input:
 * Vehicle[] vehicles = {new Car(), new Bike()}; call start() on each
 * Output:
 * Car engine starts with a roar! Bike engine starts with a purr!
 */
public class Challenge6 {
    public static void main(String[] args) {
        Vehicle car=new Car();
        Vehicle bike= new Bike();
        car.start();
        bike.start();
    }
}

class Vehicle{
    void start(){
        System.out.println("Vehicle make sound while starting..");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car engine starts with a roar!");
    }
}
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike engine starts with a purr!");
    }
}
