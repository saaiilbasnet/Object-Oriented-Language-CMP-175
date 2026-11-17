/*
 * Topic: Inheritance/method overriding - Dog overrides Animal.speak().
 * Has no main(); instantiate it from another file (e.g. new Dog()).
 */
public class Dog extends Animal {
    
    @Override
    
    public void speak(){
        System.out.println("Dog Barks!");
    }

}
