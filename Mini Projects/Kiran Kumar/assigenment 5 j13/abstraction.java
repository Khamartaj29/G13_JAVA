package override;
abstract class vehicle{
	void show() {
		System.out.println("...");
	}
}
class car extends vehicle {
	void show() {
		System.out.println(" family trip vary enjoy ment");
	}
}
class bus extends vehicle{
	void show() {
		
		System.out.println(" family trip uncomfortable journey ");
	}
}
public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          car obj=new car();
          obj.show();
          bus obj1=new bus();
          obj1.show();
            
	}

}
