package Practice;
// Define a Car class with brand, model, and price. Initialize using constructor and print car details.
public class Car {

    String brand;
    String Model;
    int price;
    //Default
    Car(){
        this.brand="BMW";
        this.Model= "M1";
        this.price=3100000;
    }

    Car(String brand, String Model, int price){
        System.out.println("--------//-------");
        this.brand=brand;
        this.Model=Model;
        this.price=price;

    }



    void details(){
        System.out.println("Brand : "+this.brand);
        System.out.println("Model : "+this.Model);
        System.out.println("Price : "+this.price);
    }



}
