package Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("What you want to buy 1. Bike   2. Car: ");
        int choice=scan.nextInt();
        if(choice ==1){
            System.out.println("Great please specify below requirement for your bike: ");
            System.out.println("Color: ");
            String color=scan.next();
            scan.nextLine();
            System.out.println("Model: options are: F 900 GS\nR1250 GS \nR 1300 GS");
            String Model=scan.nextLine();

            Bike bike= new Bike("650 cc ", "2", "150", " 3,00,000", color, Model);

            bike.showDetails();
        }

        else if(choice ==2){
            System.out.println("Great please specify below requirement for your Car: ");
            System.out.println("Color: ");
            String color=scan.next();
            scan.nextLine();
            System.out.println("Model: options are: X2 \nM5 Sedan\nM4" );
            String Model=scan.nextLine();

             NewCar car= new NewCar("BMW M TwinPower Turbo inline 6-cylinder petrol engine ", "4", "250", "53,00,000", color, Model);
             car.showDetails();
        }

    }
}
