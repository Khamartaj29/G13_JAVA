package suretrust;
interface Student
{
	public void Midexams();
	public void Labexams();
	}
class Exam implements Student
{
	public void Midexams()
	{
		System.out.print("students are having mid exams");
	}
	public void Labexams()
	{
		System.out.print("\nstudents are having internal lab exams");
	}
}
class Sem implements Student
{
	public void Midexams()
	{
		System.out.print("students are having semister exams");
	}
	public void Labexams()
	{
		System.out.print("\nstudents are having external lab exams");
	}
}
class University
{
	public static Student CreateIdno(char type)
	{
		Student s1;
		if(type=='A')
		{
			s1=new Exam();
			return s1;
		}
		
		else 
			s1=new Sem();
			return s1;
				
		    
			
		}
		
	}

public class Assignment4 {

	public static void main(String[] args) {
		Student s1=University.CreateIdno('1');
				s1.Midexams();
		        s1.Labexams();
		// TODO Auto-generated method stub

	}

}
Output:
students are having semister exams
students are having external lab exams
