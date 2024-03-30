package suretrust;
class Vehicle{
	void display() {
		System.out.println("This is a vehicle");
	}
}
class Car extends Vehicle{
	@Override
	void display() {
		System.out.println("This is a Car");
	}
}
class Bus extends Vehicle{
	@Override
	void display() {
	System.out.println("This is a Bus");	
	}
}
public class Overiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		Car c=new Car();
		Bus b=new Bus();
		
		v.display();
		c.display();
		b.display();
	}

}

/*OUTPUT:
This is a vehicle
This is a Car
This is a Bus*/

