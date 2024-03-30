package suretrust;

interface Animal {
 void sound();
}
class Dog implements Animal {
 @Override
 public void sound() {
     System.out.println("Dog barks.......");
 }
}
class Cat implements Animal {
 @Override
 public void sound() {
     System.out.println("Cat meows......");
 }
}
public class Interface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal dog = new Dog();
	        Animal cat = new Cat();
	        dog.sound();
	        cat.sound(); 
	}

}

/*OUTPUT:
Dog barks.......
Cat meows......*/
