// Abstract class
abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("The animal sleeps");
    }
}

// Class implementing the abstract method
class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
    }
}