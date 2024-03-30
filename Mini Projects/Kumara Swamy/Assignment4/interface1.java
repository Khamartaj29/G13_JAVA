package suretrust;
interface Vehicle {
    void startEngine();
}

// Class implementing the interface
class Car implements Vehicle {
    public void startEngine() {
        System.out.println("The car's engine has started.");
    }
}
public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car = new Car();
	        car.startEngine();
	}

}
