package Inharatance;

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Interface for herbivores
interface Herbivore {
    void eatPlant();
}

// Interface for carnivores
interface Carnivore {
    void eatMeat();
}

// Derived class implementing both Herbivore and Animal
class Deer extends Animal implements Herbivore {
    @Override
    public void eatPlant() {
        System.out.println("Deer is eating plants");
    }
}

// Derived class implementing both Carnivore and Animal
class Lion extends Animal implements Carnivore {
    @Override
    public void eatMeat() {
        System.out.println("Lion is eating meat");
    }
}

// Derived class implementing both Herbivore, Carnivore, and Animal
class OmnivoreBear extends Animal implements Herbivore, Carnivore {
    @Override
    public void eatPlant() {
        System.out.println("Bear is eating plants");
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear is eating meat");
    }
}

public class Hybriedinharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Deer d1=new Deer();
         d1.eat();
         d1.eatPlant();
         Lion d2=new Lion();
         d2.eat();
         d2.eatMeat();
         OmnivoreBear d3=new OmnivoreBear();
         d3.eat();
         d3.eatPlant();
         d3.eatMeat();
	}

}
