//Interface - Creative
interface Creative 
{
 public void expressCreativity(); // Method signature, to be implemented by classes
}

//Class - Painter implementing the Creative interface
class Painter implements Creative 
{
 // Implementing the expressCreativity() method
 public void expressCreativity() 
 {
     System.out.println("Creating a colorful painting");
 }
 
}

//Class - Musician implementing the Creative interface
class Musician implements Creative 
{
 // Implementing the expressCreativity() method
 public void expressCreativity() 
 {
     System.out.println("Composing a melodic piece of music");
 }
}

//Main class to demonstrate interface implementation without explicit overriding
public class Assignment_4 {

	public static void main(String[] args) {
		// Creating objects of classes implementing the Creative interface
	     Creative painter = new Painter();
	     Creative musician = new Musician();

	     // Calling the expressCreativity() method on each object
	     painter.expressCreativity(); 
	     musician.expressCreativity();

	}

}

/* OUTPUT
Creating a colorful painting
Composing a melodic piece of music
*/