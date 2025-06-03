class Car {
    static String companyName = "Tesla";
    static int carCount = 0; // Static variable to count total cars

    String model;
    String color;
    String engineNumber;

    Car(String model, String color, String engineNumber) {
        this.model = model;
        this.color = color;
        this.engineNumber = engineNumber;
        carCount++; // Increment static counter when a car is created
    }

    void displayCarInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("-----------------------------");
    }

    // Static method to return total number of cars created
    static int getCarCount() {
        return carCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Model S", "Red", "ENG12345");
        Car car2 = new Car("Model X", "Blue", "ENG67890");
        Car car3 = new Car("Model 3", "White", "ENG54321");

        car1.displayCarInfo();
        car2.displayCarInfo();
        car3.displayCarInfo();

        // Call static method without object
        System.out.println("Total Cars Manufactured: " + Car.getCarCount());
    }
}