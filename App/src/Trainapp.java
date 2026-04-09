import java.util.*;

// 🔹 Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 🔹 Passenger Bogie
class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        // Validation (Fail-Fast)
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(type + " Bogie with capacity: " + capacity);
    }
}

// 🔹 Main Class (case-sensitive)
public class Trainapp {

    public static void main(String[] args) {

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            b1.display();

            // Invalid bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            b2.display(); // won't execute

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}