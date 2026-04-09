import java.util.HashMap;
import java.util.Map;

public class Trainapp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("======================================\n");

        // HashMap stores bogie ID -> capacity
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- INSERT bogie capacities ----
        capacityMap.put("BG101", 72);   // Sleeper
        capacityMap.put("BG102", 54);   // AC Chair
        capacityMap.put("BG103", 24);   // First Class
        capacityMap.put("GD201", 100);  // Goods bogie

        // ---- DISPLAY bogie capacities ----
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie ID: " + entry.getKey() +
                    " -> Capacity: " + entry.getValue());
        }
    }
}