 package assign.java;
class grandfather
{
	void head()
	{
		System.out.println("grandfather head");
	}
}
class father extends grandfather //single inheritance
{
	void tells()
	{
		System.out.println("nana tell me stories");
	}
}
class son extends grandfather   //hierachical inheritance(one super, one sub)
{
	void ride()
	{
		System.out.println("ride cycle");
	}
}
class daughter extends son 
{
	void goes to()
	{
		System.out.println("goes to college");
	}
}
class nephew extends father   // multi level inheritance 
{
	void leave()
	{
		System.out.println("leave the hostel");
	}
}


public class Assign_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		daughter ref = new daughter();
		ref.head();
		ref.ride();
		ref.goes to();
		System.out.println("===============");
		
		father ref1 = new father();
		ref1.head();
		ref1.tells();
		System.out.println("===============");
		
		nephew r2 = new nephew();
		r2.head();
		r2.leave();
		

	}

}