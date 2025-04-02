public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Brand", "Petrol", 120);
        vehicle.displayDetails();
        System.out.println("---------------------------------------");
        Car car = new Car("Toyota", "Petrol", 180, "V6", 5);
        car.displayDetails();car.start();car.accelerate();car.stop();
        System.out.println("---------------------------------------");
        Bike bike = new Bike("Giant", "None", 25, true);
        bike.displayDetails();bike.start();bike.ride();bike.stop();
        System.out.println("---------------------------------------");
    }
}
class Vehicle {
    private String brand;
    private String fuelType;
    private int speed;

    // Constructor
    public Vehicle(String brand, String fuelType, int speed) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.speed = speed;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Speed: " + speed + " km/h");
    }
    public void start() {
        System.out.println("Vehicle is starting... ");
    }
    public void stop() {
        System.out.println("Vehicle is stopping... ");
    }
}
class Car extends Vehicle {
    private String engineType;
    private int passengerCapacity;

    public Car(String brand, String fuelType, int speed, String engineType, int passengerCapacity) {
        super(brand, fuelType, speed);
        this.engineType = engineType;
        this.passengerCapacity = passengerCapacity;
    }
    public void accelerate() {
        System.out.println("The car is accelerating....");
    }
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the parent class's method
        System.out.println("Engine Type: " + engineType);
        System.out.println("Passenger Capacity: " + passengerCapacity);
    }
    @Override public void start() {
        System.out.println("Car is starting... ");
    }
    @Override public void stop() {
        System.out.println("Car is stopping... ");
    }
}
class Bike extends Vehicle {
    private boolean isElectric;  // New field for whether the bike is electric

    public Bike(String brand, String fuelType, int speed, boolean isElectric) {
        super(brand, fuelType, speed);
        this.isElectric = isElectric;
    }
    public void ride() {
        System.out.println("The bike has started riding....");
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Electric: " + (isElectric ? "Yes" : "No"));
    }
    @Override public void start() {
        System.out.println("Bike is starting... ");
    }
    @Override public void stop() {
        System.out.println("Bike is stopping... ");
    }
}
