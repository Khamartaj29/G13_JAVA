package override;
class teacher{
	void kiran () {
		System.out.println("good morning sir....	");
	}
}
class student extends teacher{
	@Override 
	void kiran() {
		System.out.println(" Thank you sir....");
	}
}

public class family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        teacher obj1=new teacher();
        obj1.kiran();
        student obj2=new student();
        obj2.kiran();
	}

}
