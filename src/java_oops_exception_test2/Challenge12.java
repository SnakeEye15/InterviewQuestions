package java_oops_exception_test2;

/**
 * Method Overriding Demo
 * Write a program to demonstrate method overriding by creating parent and child classes with the same method signature.
 *
 * Examples:
 * Input:
 * Parent and Child objects calling display() method
 * Output:
 * Parent class display method Child class display method
 */
public class Challenge12 {
    public static void main(String[] args) {
        Parent child= new Child();
        child.display();
        Parent parent= new Parent();
        parent.display();
    }
}

class Parent{
    void display(){
        System.out.println("Parent class display method");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("Child class display method");
    }
}
