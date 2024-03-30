package assign.java;
abstract class car
{
	 abstract void drive();//abstract method
	 abstract void play();
	 void fly()			   //concrete method
	{
		System.out.println("flying..!");
	}
	 
}
abstract class speaker extends car
{
	 void drive() 
	{
		System.out.println("driving..!");
	}

	 void play()
	{
		System.out.println("Playmusic..!");
	}
	abstract void paints();

	
}
 class color extends speaker
{
	 void paints()
		{
			System.out.println("painting..!");
		}
}
 
public class Assign_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj = new color();
		obj.drive();
		obj.play();
		obj.fly();
		speaker obj1 = new color();
		obj1.paints();
		
	}

}

/*output:
driving..!
Playmusic..!
flying..!
painting..!
*/


 
