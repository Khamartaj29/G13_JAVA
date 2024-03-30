//Interface - River
interface River 
{
 public void flow(); // Generalized method for flowing
 public void makeSound(); // Generalized method for making sound
}

//Implementation Class - ConcreteRiver implementing the River interface
class ConcreteRiver implements River 
{
 // Implementation of the flow() method
 public void flow() 
 {
     System.out.println("The river is flowing smoothly.");
 }

 // Implementation of the makeSound() method
 public void makeSound() 
 {
     System.out.println("The river is making a soothing sound.");
 }
 
}
class Krishna implements River
{
	public void flow() 
	{
		System.out.println("Krishna River is flowing smoothly.");
	}
	public void makeSound() 
	{
		System.out.println("Krishna River is making a soothing sound.");
	}
}
class Yamuna
{
	public static River Narmada(char type) 
	{
		River r1; //Interface Variable
		if(type=='C') 
		{
			r1=new ConcreteRiver(); //Creating the object of implementation class and store the address in interface reference
			return r1;
		}
		else 
		{
			r1=new Krishna();
			return r1;
		}
	}
}

public class Assignment_5 
{

	public static void main(String[] args) 
	{
		River r1=Yamuna.Narmada('C');
		r1.flow();
		r1.makeSound();
	}

}

/* OUPUT:
  The river is flowing smoothly.
  The river is making a soothing sound.
*/
