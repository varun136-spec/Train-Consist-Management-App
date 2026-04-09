import java.util.*;

public class Trainapp {

    // Inner class to represent a Bogie
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
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("======================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("BG101", 72));
        bogies.add(new Bogie("BG102", 54));
        bogies.add(new Bogie("BG103", 24));
        bogies.add(new Bogie("BG104", 60));

        // ---- DISPLAY UNSORTED ----
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- SORT using Comparator (by capacity) ----
        Collections.sort(bogies, new Comparator<Bogie>() {
            @Override
            public int compare(Bogie b1, Bogie b2) {
                return b1.capacity - b2.capacity; // ascending
            }
        });

        // ---- DISPLAY SORTED ----
        System.out.println("\nAfter Sorting (by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}