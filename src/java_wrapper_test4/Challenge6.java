package java_wrapper_test4;

/**
 * Generic Class for Pair
 * Create a generic class `Pair` that holds two values of any type.
 *
 * Examples:
 * Input:
 * Pair("Test", 100)
 * Output:
 * First: Test, Second: 100
 */
public class Challenge6 {
    public static void main(String[] args) {
        Pair<Integer,String> pair= new Pair<>(1,"Dheeraj");
        pair.display();
    }
}
class Pair<T,U>{
   private T first;
   private U second;

   public Pair(T first, U second){
    this.first=first;
    this.second=second;}

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void display(){
        System.out.println(this.first);
        System.out.println(this.second);
    }

}

