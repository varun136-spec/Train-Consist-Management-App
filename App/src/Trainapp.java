import java.util.ArrayList;
import java.util.List;

public class Trainapp {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // UC1: Initialization
        System.out.println("Train initialized successfully...");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // UC2: Add passenger bogies
        System.out.println("\nAdding passenger bogies...");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display updated consist
        System.out.println("Current train consist: " + trainConsist);

        // Check if a bogie exists
        String searchBogie = "AC Chair";
        if (trainConsist.contains(searchBogie)) {
            System.out.println(searchBogie + " bogie is present in the train.");
        } else {
            System.out.println(searchBogie + " bogie is NOT present.");
        }

        // Remove a bogie
        System.out.println("\nRemoving a bogie (Sleeper)...");
        trainConsist.remove("Sleeper");

        // Final state
        System.out.println("Final train consist: " + trainConsist);
        System.out.println("Final number of bogies: " + trainConsist.size());
    }
}