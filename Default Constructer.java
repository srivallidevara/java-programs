class Bike {
    String brand;
    int speed;

    // Default Constructor (User-defined)
    Bike() {
        brand = "Yamaha";
        speed = 40;
        System.out.println("Default constructor is called.");
    }

    // Method to display values
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object triggers the default constructor automatically
        Bike myBike = new Bike();
        
        // Calling method to print the values
        myBike.display();
    }
}

