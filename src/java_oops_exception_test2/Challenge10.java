package java_oops_exception_test2;

/***
 * Multiple Interface Implementation
 * Create interfaces "Flyable" and "Swimmable" with appropriate methods. Implement both in a "Duck" class.
 *
 * Examples:
 * Input:
 * Create Duck object and call fly() and swim() methods
 * Output:
 * Duck is flying in the sky! Duck is swimming in the water!
 */
public class Challenge10 {
    public static void main(String[] args) {
        Duck duck= new Duck();
        duck.fly();
        duck.swim();
    }
}

interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}

class Duck implements Flyable,Swimmable{
    public void fly(){
        System.out.println("Duck is flying in the sky!");
    }
    public void swim(){
        System.out.println("Duck is swimming in the water!");
    }
}
