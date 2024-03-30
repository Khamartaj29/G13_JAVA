package suretrust;
class Maheswari{
	void show() {
		System.out.print("My name is Maheswari");
	}
}
class Mahima extends Maheswari{
	@Override
	void show() {
		
		System.out.print("My friend is used to call me Mahima");
}
}
public class Assignment3 {
	public static void main(String[] args) {
		Mahima m1=new Mahima();
		m1.show();
	}

}
output:
My friend is used to call me Mahima