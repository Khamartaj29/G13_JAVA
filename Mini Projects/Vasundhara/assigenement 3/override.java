package override;

class doctor{
	void show () {
		System.out.println("lucky person....	");
	}
}
class patient  extends doctor{
	@Override 
	void show() {
		System.out.println(" Thank you sir....");
	}
}



	
		// TODO Auto-generated method stub
        
public class override {

	public static void main(String[] args) {
		doctor obj1=new doctor();
        obj1.show();
        patient obj2=new patient();
        obj2.show();
		// TODO Auto-generated method stub

	}

}
