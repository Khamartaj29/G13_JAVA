package learningandpraticingjava;
//interface
interface Cloth
{
	public void cloth();
}
//creating a class
class Trend
{
	public void trend() 
	{
		System.out.println("People follow trend");		
	}
}
//inherting a class and implementing a interface
class Designer extends Trend implements Cloth
{
	@Override
	public void cloth()
	{
		System.out.println("The designer is responsible for making the clothes trendy");
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Designer d=new Designer();
       d.trend();
       d.cloth();
	}

	/* OUTPUT:
	 People follow trend
     The designer is responsible for making the clothes trendy
     */
}
