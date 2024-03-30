package assign.java;
interface movie
{
	void Telugu();
	void Hindi();
	// All the variables inside the interface 
	//it acts as a static and final
	byte age=20;
	String name="Mansoor";
}
class Series implements movie,sport
{
	public void Telugu() 
	{
		System.out.println("telugu movie");
	}

	public void Hindi() 
	{
		System.out.println("Hindi movie");
	}
	
	public void Kabaddi()
	{
		System.out.println("I love Kabaddi");	
	}
	
}

interface sport
{
	void Kabaddi();
}
class game implements sport
{
	public void Kabaddi() 
	{
		System.out.println("Kabaddi");
	}
	
}
public class Assign_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie obj;
		//obj = new movie();   
		//-->we can't create objects for interface
		
		obj = new Series();
		obj.Telugu();
		obj.Hindi();
	
		sport obj1;
		obj1 = new Series();
		obj1.Kabaddi();
		
		System.out.println(movie.age);
		System.out.println(movie.name);
		
		//We can create a objects for subclass not for interface
		sport obj2;
		obj2 = new game();
		obj2.Kabaddi();
	}

}
/*output:
Hindi movie
I love Kabaddi
20
Mansoor
Kabaddi
*/