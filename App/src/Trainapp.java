import java.util.*;
import java.util.stream.Collectors;

public class Trainapp {

    // Reusing Bogie class
    static class Bogie {
        String id;
        int capacity;

        Bogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return id + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC8 - Filter Passenger Bogies (Streams)");
        System.out.println("======================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("BG101", 72));
        bogies.add(new Bogie("BG102", 54));
        bogies.add(new Bogie("BG103", 24));
        bogies.add(new Bogie("BG104", 60));

        // ---- DISPLAY ALL ----
        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // ---- FILTER (capacity > 50) ----
        List<Bogie> highCapacity = bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());

        // ---- DISPLAY FILTERED ----
        System.out.println("\nHigh Capacity Bogies (>50):");
        highCapacity.forEach(System.out::println);
    }
}