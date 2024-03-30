 
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

 
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();  
        myDog.makeSound();  
    }
}