package Practice;
//Description: Create a class Animal with a method sound(). Inherit it in Dog class and override the method.
//Description: Create class Grandparent → Parent → Child and demonstrate multilevel inheritance.
public class animal {
    void sound(){
        System.out.println("Animals making sound.");
    }
    void live(){
        System.out.println("Animals live in forest.");
    }

}


class Dog extends animal{
    void sound(){
        System.out.println("Dogs making sound..");
        super.sound();
    }
    void live(){
        System.out.println("Dogs live either on street or master's home.");
    }


}


class Tommy extends Dog{
    void live(){
        System.out.println("Tommy live in Ramesh's house..");
    }
    void sound(){
        super.sound();
    }
}








