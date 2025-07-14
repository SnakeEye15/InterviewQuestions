package java_oops_exception_test2;

/***
 * Animal Sound Polymorphism
 * Create a class "Animal" and subclasses "Dog" and "Cat". Override a method to make each animal make a sound.
 *
 * Examples:
 * Input:
 * Create Dog and Cat objects and call makeSound()
 * Output:
 * Dog says: Woof! Woof! Cat says: Meow! Meow!
 */
public class Challenge5 {
    public static void main(String[] args) {
        Animal dog= new Dog();
        dog.makeSound();
        Animal cat=new Cat();
        cat.makeSound();
    }
}

class Animal {
    void makeSound(){
        System.out.println("All animals make sound.");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Says: Woof! Woof!");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat says: Meow! Meow!");
    }
}

