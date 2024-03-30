package Inharatance;
class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " is starting.");
    }

    public void stop() {
        System.out.println(brand + " is stopping.");
    }
}

// Car class (Child class inheriting from Vehicle)
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public void drive() {
        System.out.println(brand + " is driving with " + numberOfDoors + " doors.");
    }
}

// Motorcycle class (Child class inheriting from Vehicle)
class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    public void ride() {
        System.out.println(brand + " is riding.");
    }
}


public class HybriedAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Toyota", 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson");

        // Accessing methods through inheritance
        car.start();
        car.drive();
        car.stop();

        motorcycle.start();
        motorcycle.ride();
        motorcycle.stop();
	}

}
