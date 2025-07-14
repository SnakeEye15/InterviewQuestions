package practice2;

public class document implements Printable,Showable{
    @Override
    public void print() {
        System.out.println("Message overriding for Printable interface...");
    }

    @Override
    public void show() {
        System.out.println("Message overriding for Showable interface..");
    }
}
