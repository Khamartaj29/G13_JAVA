package learningandpraticingjava;
class Shape {
    public void draw() 
    {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape //single level inheritence
{
	public void circle() 
    {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape // hierachial inheritence
{
    void square() 
    {
        System.out.println("Drawing a square");
    }
}

class ColoredSquare extends Square 
{
    void colorSquare() {
        System.out.println("Coloring the square");
    }
}

class ColoredCircle extends Circle  //multi level inheritence
{
	void colorCircle() 
	{
        System.out.println("Coloring the circle");
    }
}



public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating obj 
		ColoredCircle ref = new ColoredCircle();
		ref.draw();
		ref.circle();
		ref.colorCircle();
		System.out.println(" ");
		
		ColoredSquare r = new ColoredSquare();
		r.draw();
		r.square();
		r.colorSquare();
		
	}

}
