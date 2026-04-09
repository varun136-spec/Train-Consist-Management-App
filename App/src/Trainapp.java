import java.util.LinkedHashSet;
import java.util.Set;

public class Trainapp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("======================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- ADD bogies (including duplicates) ----
        formation.add("Engine");
        formation.add("BG101");
        formation.add("BG102");
        formation.add("BG103");
        formation.add("Guard");

        // Duplicate entries (ignored automatically)
        formation.add("BG101");
        formation.add("BG102");

        // ---- DISPLAY final train formation ----
        System.out.println("Final Train Formation:");
        for (String bogie : formation) {
            System.out.println(bogie);
        }
    }
}