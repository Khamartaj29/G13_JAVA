package suretrust;

interface Education{
	public void School();
	public void Teachers();
	public void Students();
}
class Learn implements Education{
	public void School() {
		System.out.println("School is a Temple.....");
	}
	public void Teachers() {
		System.out.println("Teacher is a God......");
	}
	public void Students() {
		System.out.println("Students are Devotees......");
	}
}
class Activity implements Education{
	public void School() {
		System.out.println("Go to School and participate in Activities");
	}
	public void Teachers() {
		System.out.println("Teacher engaged the students in interactive activities");
	}
	public void Students() {
		System.out.println("Students are enjoying with club Activities");
	}
}
class Board{
	public static Education Info(int type) {
		Education edu;
		if(type==5){
			edu=new Learn();
			return edu;
		}
		else {
			edu=new Activity();
			return edu;
		}
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Education edu=Board.Info(5);
		edu.School();
        edu.Teachers();
        edu.Students();

	}

}



/*OUTPUT:
 School is a Temple.....
Teacher is a God......
Students are Devotees......*/







