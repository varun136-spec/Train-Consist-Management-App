import java.util.*;
import java.util.stream.Collectors;

public class Trainapp {

    // Bogie class with type
    static class Bogie {
        String id;
        String type;
        int capacity;

        Bogie(String id, String type, int capacity) {
            this.id = id;
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return id + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("======================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("BG101", "Sleeper", 72));
        bogies.add(new Bogie("BG102", "AC Chair", 54));
        bogies.add(new Bogie("BG103", "Sleeper", 72));
        bogies.add(new Bogie("BG104", "First Class", 24));
        bogies.add(new Bogie("BG105", "AC Chair", 54));

        // ---- GROUP BY TYPE ----
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // ---- DISPLAY GROUPED DATA ----
        System.out.println("Grouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }
    }
}