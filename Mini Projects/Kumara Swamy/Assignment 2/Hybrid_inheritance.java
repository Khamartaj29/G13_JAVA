package suretrust;
// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Interface for Multiple Inheritance
interface Swimmer {
    void swim();
}

// Interface for Multiple Inheritance
interface Flyer {
    void fly();
}

// Multiple Inheritance through Interfaces
class Bird implements Swimmer, Flyer {
    public void swim() {
        System.out.println("Bird is swimming");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}

// Multilevel Inheritance
class Poodle extends Dog {
    void playFetch() {
        System.out.println("Poodle is playing fetch");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Hybrid_inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();
        myDog.bark();

        // Multiple Inheritance through Interfaces
        Bird myBird = new Bird();
        myBird.swim();
        myBird.fly();

        // Multilevel Inheritance
        Poodle myPoodle = new Poodle();
        myPoodle.eat();
        myPoodle.sleep();
        myPoodle.bark();
        myPoodle.playFetch();

        // Hierarchical Inheritance
        Cat myCat = new Cat();
        myCat.eat();
        myCat.sleep();
        myCat.meow();
    }
}
