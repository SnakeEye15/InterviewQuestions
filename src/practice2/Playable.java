package practice2;

/***
 * Objective:
 *
 * Learn how interfaces support polymorphism – calling the same method on different implementations.
 *
 * 🔶 Steps:
 *
 *
 *
 *
 *
 * Create an interface Playable with method play().
 *
 *
 *
 * Create two classes: Guitar and Piano, both implement Playable.
 *
 *
 *
 * Implement the play() method in both classes with different messages.
 *
 *
 *
 * In main(), declare a reference of type Playable and assign it objects of Guitar and Piano one by one.
 *
 *
 *
 * Call play() on each.
 *
 * 🔶 Expected Output:
 *
 * Playing Guitar
 *
 * Playing Pia
 */
public interface Playable {
    void play();
}

class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Guitar...");
    }
}

class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Piano..");
    }
}

class test{
    public static void main(String[] args) {
        Guitar guitar= new Guitar();
        Piano piano= new Piano();
        guitar.play();
        piano.play();
    }
}
