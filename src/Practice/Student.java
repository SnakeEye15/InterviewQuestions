package Practice;
//Create a class Student with a constructor to initialize name and age. Print both using a display method.
public class Student {
    String name;
    int age;
    //for default values
    Student(){
        this.name="Raj";
        this.age=34;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;

    }

    void display(){
        System.out.println("--------//-------");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }




}
