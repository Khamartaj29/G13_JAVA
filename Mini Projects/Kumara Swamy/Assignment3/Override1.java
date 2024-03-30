package suretrust;
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
public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();

	}

}
