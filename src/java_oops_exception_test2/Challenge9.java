package java_oops_exception_test2;

/***
 * Drawable Interface Implementation
 * Create an interface "Drawable" with a method "draw()". Implement this interface in classes "Circle" and "Rectangle".
 *
 * Examples:
 * Input:
 * Create Circle and Rectangle objects, call draw() method
 * Output:
 * Drawing a Circle Drawing a Rectangle
 */
public class Challenge9 {
    public static void main(String[] args) {
        Drawable circle=new Circles();
        Drawable rectangle = new Rectangles();
        circle.draw();
        rectangle.draw();
    }
}

interface Drawable{
    void draw();
}

class Circles implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}

class Rectangles implements Drawable{
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}