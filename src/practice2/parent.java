package practice2;

/***
 *  Objective:
 *
 * Understand how abstract classes can contain both abstract methods (which must be implemented in the subclass) and concrete methods (which can be used as-is).
 *
 * 🔶 Steps to Create:
 *
 *
 *
 *
 *
 * Create an abstract class Parent.
 *
 *
 *
 * Define one abstract method void show().
 *
 *
 *
 * Define one concrete method void display() that prints a message.
 *
 *
 *
 * Create a class Child that extends Parent.
 *
 *
 *
 * Implement the show() method inside Child.
 *
 *
 *
 * In the main() method, create an object of Child and call both display() and show().
 *
 * 🔶Expected Output:
 *
 * Concrete method in abstract class
 *
 * Abstract method implemented
 */
abstract class parent {
    //abstract method
    void show(){
    }

    //Concrete method
    void display(){
        System.out.println("We are inside abstract class's concrete method..");
    }
}

class Child extends parent{
    @Override
    void show() {
        System.out.println("This is method overriding of abstract class..");
    }
}
