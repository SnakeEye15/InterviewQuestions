package practice2;

/***
 * Description: Create an abstract class Animal with an abstract method makeSound(). Extend it in Dog and Cat.
 *
 * 🔶 Expected Output:
 *
 *  Dog barks
 *
 * Cat meows
 */
abstract class animal {
    void makeSound(){}
}


class dog extends animal{
    @Override
    void makeSound() {
        System.out.println("Dog Barks..");
    }
}

class cat extends animal{
    @Override
    void makeSound() {
        System.out.println("Cat Meow..");
    }
}