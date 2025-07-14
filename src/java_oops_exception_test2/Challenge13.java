package java_oops_exception_test2;

/***
 * Outer and Inner Class Implementation
 * Create a class "Outer" with an inner class "Inner". Access the inner class from the outer class and demonstrate their interaction.
 *
 * Examples:
 * Input:
 * Outer class with variable x=10, Inner class accessing x
 * Output:
 * Outer class variable x: 10 Inner class accessing outer variable: 10
 */
public class Challenge13 {
    public static void main(String[] args) {
        Outer out= new Outer();
        System.out.println("Outer class variable x: "+out.x);
        out.showInner();
    }
}

class Outer{
    Integer x=10;
    class Inner{
        void display(){
            System.out.println("Inner class accessing outer variable: "+x);
        }
    }
    void showInner(){
        Inner inner= new Inner();
        inner.display();
    }
}

