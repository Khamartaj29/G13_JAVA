
package suretrust;
class Grandfather
{
	public void g()
	{
		int land=100;
		int gold=1;
		System.out.print("\n I am having"+ land +"acres of land and "+ gold +" kg of gold");
	}
}
class Father extends Grandfather
{
	public void f()
	{
		System.out.print("\n My father gave me land as my share");
	}
}
class Aunt extends Grandfather
{
	public void a()
	{
		System.out.print(" \n my father gave me gold as my share");
	}
	
}
class me extends Father 
{
	public void m()
	{
	System.out.print("\n I am having 100 acres of land");
	}
}

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     me n=new me();
     n.m();
     n.f();
     n.g();
    		 
	}

}
