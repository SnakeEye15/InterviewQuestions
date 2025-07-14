package practice2;

/***
 * Description: Show that abstract class can have constructor. Print message from constructor and method.
 */
abstract class abstractConstructor {
    abstractConstructor(){
        System.out.println("This is message from abstract class's constructor.. ");
    }

    void getMessage(){
        System.out.println("This is message from abstract class's method... ");
    }

}

class demo extends abstractConstructor{

}


