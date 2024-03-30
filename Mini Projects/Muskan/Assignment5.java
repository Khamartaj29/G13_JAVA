package learningandpraticingjava;

interface Login  //interface
{
	public void username();
	public void password();
}

class Admin implements Login //inheriting interface 
{
	public void username()
	{
		System.out.println("Admin should login using username");
	}
	public void password()
	{
		System.out.println("Admin shuold enter correct password to login");
	}
}

class Student implements Login
{
	public void username() 
	{
		System.out.println("Student should login using username");
	}
	public void password()
	{
		System.out.println("Student shuold enter correct password to login");
	}
}
class ClgWebsite
{
	public static Login website(char who)
	{
		Login l;  //interface reference
		if(who=='A')
		{
		  return l=new Admin();
		}
		else
		{
		  return l=new Student();
		}
	}
}

public class Assignment5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Login l =ClgWebsite.website('b'); 
        l.username();
        l.password();
       
	}

}
/* OUTPUT
  Student should login using username
  Student shuold enter correct password to login */

