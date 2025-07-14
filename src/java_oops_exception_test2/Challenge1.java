package java_oops_exception_test2;

import Practice.Main;

import java.util.Scanner;

/***
 * Person Class Implementation
 * Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
 *
 * Examples:
 * Input:
 * Create Person objects with names "John" (25) and "Alice" (30)
 * Output:
 * Name: John, Age: 25 Name: Alice, Age: 30
 */
public class Challenge1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        scan.nextLine();
        Integer age=scan.nextInt();

        Person p1=new Person(name,age);

        System.out.println("Name: "+p1.getName()+",Age: "+p1.getAge());

    }
}

class Person{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
