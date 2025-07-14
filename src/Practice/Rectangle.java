package Practice;

public class Rectangle {
    int length;
    int breadth;
    //Default
    Rectangle(){
        this.length=5;
        this.breadth=10;
    }

    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    int area(){
        return (this.length)*(this.breadth);
    }



}
