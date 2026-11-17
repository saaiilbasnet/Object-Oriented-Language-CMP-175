/*
 * Topic: Inheritance/method overriding - Cat overrides Animal.speak().
 * Has no main(); instantiate it from another file (e.g. new Cat()).
 */
public class Cat extends Animal {
    
    @Override
    
    public void speak(){
        System.out.println("Cat Mewos!");
    }

}
