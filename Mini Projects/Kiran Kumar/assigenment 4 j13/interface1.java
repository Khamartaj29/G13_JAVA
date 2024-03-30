package Interface;
import java.util.*;
 interface In1{
	final int a=10;
	void show();
}
class testclass implements In1 {
	 

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(" wellcome  ");
	}
 }
public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     testclass obj1=new testclass();
     obj1.show();
 
	}

}
