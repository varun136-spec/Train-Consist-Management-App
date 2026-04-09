import java.util.*;

// 🔹 Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// 🔹 Goods Bogie
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            // Validation rule
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    public void display() {
        System.out.println("Type: " + type + ", Cargo: " + cargo);
    }
}

// 🔹 Main Class (case-sensitive)
public class Trainapp {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ✅ Safe assignment
        b1.assignCargo("Petroleum");

        // ❌ Unsafe assignment (handled safely)
        b2.assignCargo("Petroleum");

        // Program continues
        b2.assignCargo("Coal");

        // Display final state
        b1.display();
        b2.display();
    }
}