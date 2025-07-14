package java_oops_exception_test2;

import java.net.Inet4Address;
import java.util.Scanner;

/***
 * Student Management System
 * Implement a class "Student" with attributes "name", "rollNo", and "section". Add a method to print student details.
 *
 * Examples:
 * Input:
 * Create student with name="Bob", rollNo=101, section="A"
 * Output:
 * Student: Bob, Roll No: 101, Section: A
 */

public class Challenge2{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter name: ");
        String name=scan.next();
        System.out.println("Please enter the roll no. ");
        Integer rollNo=scan.nextInt();
        System.out.println("Please enter the section \"A \\B\"");
        Character section=scan.next().charAt(0);

        Student s1=new Student(name,rollNo,section);
        s1.getDetails();
    }

}

class Student{
    private String name;
    private Integer rollNo;
    private Character section;

    Student(String name, Integer rollNo, Character section){
        this.name=name;
        this.rollNo=rollNo;
        this.section=section;
    }

    public String getName(){
        return name;
    }

    public Integer getRollNo(){
        return rollNo;
    }

    public Character getSection(){
        return section;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setRollNo(Integer rollNo){
        this.rollNo=rollNo;
    }
    public void setSection(Character section){
        this.section=section;
    }
    public void getDetails(){
        System.out.println("Student details are given below:");
        System.out.println("Name: "+this.name);
        System.out.println("Roll no: "+this.rollNo);
        System.out.println("Section: "+this.section);
    }

}
