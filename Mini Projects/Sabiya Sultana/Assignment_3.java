//Base class - Shape
class Shape 
{
 // Method in the base class
 void draw() 
 {
     System.out.println("Drawing a generic shape");
 }
}

//Derived class - Circle (extends Shape)
class Circle extends Shape 
{
 // Overriding the draw() method from the base class
 @Override
 void draw() 
 {
     System.out.println("Drawing a circle");
 }
}

//Derived class - Square (extends Shape)
class Square extends Shape 
{
 // Overriding the draw() method from the base class
 @Override
 void draw() 
 {
     System.out.println("Drawing a square");
 }
}

//Main class to demonstrate method overriding
public class Assignment_3 {

	public static void main(String[] args) {
		// Creating objects of the derived classes
	     Shape genericShape = new Shape();
	     Shape circle = new Circle();
	     Shape square = new Square();

	     // Calling the draw() method on each object
	     genericShape.draw();
	     circle.draw(); 
	     square.draw();

	}

}


/* OUTPUT:
Drawing a generic shape
Drawing a circle
Drawing a square
*/
