//Program for Hybrid Inheritance
class Bird{
	public void fly()
	{
		System.out.println("The bird is flying.");
	}
}
//Single level inheritance
class Sparrow extends Bird
{
	public void chirp()
	{
		System.out.println("The sparrow is chirping.");
	}
}
//Hierarchical inheritance
class Eagle extends Bird
{
	public void soar()
	{
		System.out.println("The eagle is soaring high.");
	}
}
//Multi-level inheritance
class Penguin extends Bird
{
	public void swim()
	{
		System.out.println("The penguin is swimming.");
	}
}
//Main class to test the inheritances
public class Assignment_2
{
	public static void main(String[] args) {
		//creating objects
		
		//Object for Single level inheritance
		Sparrow sparrow=new Sparrow();
		sparrow.fly();
		sparrow.chirp();
		
		//Object for Hierarchical inheritance
		Eagle eagle=new Eagle();
		eagle.fly();
		eagle.soar();
		
		//Object for Multi-level inheritance
		Penguin penguin=new Penguin();
        penguin.fly();
		penguin.swim();
	}
}