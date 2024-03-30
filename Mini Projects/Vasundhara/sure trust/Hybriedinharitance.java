package Inharatance;

class Principal{
	public void principal() {
		System.out.println(" good morning sir....");
	}
}
class Teacher extends Principal {
	public void teacher() {
		System.out.println("  good morning teacher....");
	}
}
class Student extends Teacher{
	public void student() {
		System.out.println(" hello students...");
	}
}

public class Hybriedinharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student obj =new Student();
         obj.principal();
         obj.teacher();
         obj.student();
	}

}
