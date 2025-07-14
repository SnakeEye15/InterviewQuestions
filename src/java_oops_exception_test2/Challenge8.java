package java_oops_exception_test2;

import java.util.Scanner;

/***
 * Abstract Shape Implementation
 * Implement an abstract class "Shape" with an abstract method "getArea()". Create subclasses "Rectangle" and "Circle" and implement "getArea()" for each.
 *
 * Examples:
 * Input:
 * Rectangle: length=5, width=3; Circle: radius=4
 * Output:
 * Rectangle Area: 15.0 Circle Area: 50.26548245743669
 */
public class Challenge8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the length of rectangle:");
        Double length=scan.nextDouble();
        System.out.println("Please enter the width of rectangle:");
        Double width=scan.nextDouble();
        Shape rectangle= new Rectangle(length,width);
        System.out.println("Area of Rectangle is: "+rectangle.getArea());

        //now for circle
        System.out.println("Please enter the radius of Circle:");
        Double radius=scan.nextDouble();
        Shape circle= new Circle(radius);
        System.out.println("Area of circle is: "+circle.getArea());
    }
}

abstract class Shape{
    abstract Double getArea();
}

class Rectangle extends Shape{
    private Double length;
    private Double width;
    Rectangle(Double length, Double width){
        this.length=length;
        this.width=width;
    }
    @Override
    Double getArea(){
        return length*width;
    }

}
class Circle extends Shape{
    private Double radius;

    Circle(Double radius){
        this.radius=radius;
    }
    @Override
    Double getArea(){
        return Math.PI*radius*radius;
    }

}
