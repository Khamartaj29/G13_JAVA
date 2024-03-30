package assign.java;
class Developer
{
	void laptop()
	{
		System.out.println("code,compile,run");
	}
	void Desktop()
	{
		System.out.println("code,compile,run, faster");
	}
}
class tester extends Developer
{
	@Override
	void laptop()
	{
		System.out.println("It carries easily");
	}
}
public class Assign_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer obj;
		obj = new tester();
		obj.laptop();
		obj.Desktop();
		

	}
	

}


//Output: 
//It carries easily
//code,compile,run, faster
