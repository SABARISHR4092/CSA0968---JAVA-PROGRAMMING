class Vehicle {

    // Attributes
    String brand;
    int speed;
    String fuelType;

    // Constructor
    Vehicle(String brand, int speed, String fuelType) {

        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Method
    void displayDetails() {

        System.out.println("Brand      : " + brand);
        System.out.println("Speed      : " + speed);
        System.out.println("Fuel Type  : " + fuelType);
    }
}

// Car class inherits Vehicle
class Car extends Vehicle {

    int numberOfDoors;

    // Constructor
    Car(String brand,
        int speed,
        String fuelType,
        int numberOfDoors) {

        super(brand, speed, fuelType);

        this.numberOfDoors = numberOfDoors;
    }

    // Method Overriding
    @Override
    void displayDetails() {

        System.out.println("===== Car Details =====");

        System.out.println("Brand            : " + brand);
        System.out.println("Speed            : " + speed);
        System.out.println("Fuel Type        : " + fuelType);
        System.out.println("Number of Doors  : "
                + numberOfDoors);
    }
}

// Bike class inherits Vehicle
class Bike extends Vehicle {

    boolean sportsBike;

    // Constructor
    Bike(String brand,
         int speed,
         String fuelType,
         boolean sportsBike) {

        super(brand, speed, fuelType);

        this.sportsBike = sportsBike;
    }

    // Method Overriding
    @Override
    void displayDetails() {

        System.out.println("===== Bike Details =====");

        System.out.println("Brand       : " + brand);
        System.out.println("Speed       : " + speed);
        System.out.println("Fuel Type   : " + fuelType);
        System.out.println("Sports Bike : "
                + sportsBike);
    }
}

// Main class
public class Question3 {

    public static void main(String[] args) {

        // Vehicle reference
        Vehicle v1;

        // Car object
        v1 = new Car(
                "Hyundai",
                180,
                "Petrol",
                4
        );

        v1.displayDetails();

        System.out.println();

        // Bike object
        v1 = new Bike(
                "Yamaha",
                220,
                "Petrol",
                true
        );

        v1.displayDetails();
    }
}