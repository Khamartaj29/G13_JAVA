package assign.java;
class Animal
{
	void speak()
	{
		System.out.println("Animal speak");
	}
}
class Mammal extends Animal //single inheritance
{
	void giveBirth()
	{
		System.out.println("Dog is giving Birth");
	}
}
class Bird extends Animal   //hierachical inheritance(one super, one sub)
{
	void layeggs()
	{
		System.out.println("Bat is laying eggs");
	}
}
class Grass extends Bird 
{
	void sit()
	{
		System.out.println("Bird's are sitting in a tree");
	}
}
class tree extends Mammal   // multi level inheritance 
{
	void leafs()
	{
		System.out.println("Animal are eating a leafs");
	}
}


public class Assign_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grass ref = new Grass();
		ref.speak();
		ref.layeggs();
		ref.sit();
		System.out.println("===============");
		
		Mammal ref1 = new Mammal();
		ref1.speak();
		ref1.giveBirth();
		System.out.println("===============");
		
		tree r2 = new tree();
		r2.speak();
		r2.leafs();
		

	}

}
