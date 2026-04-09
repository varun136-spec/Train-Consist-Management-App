import java.util.LinkedList;
import java.util.List;

public class Trainapp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("======================================\n");

        // Create a LinkedList
        List<String> trainConsist = new LinkedList<>();

        // ---- ADD bogies in sequence ----
        trainConsist.add("Engine");
        trainConsist.add("BG101");
        trainConsist.add("BG102");
        trainConsist.add("BG103");
        trainConsist.add("Guard");

        // ---- DISPLAY initial consist ----
        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ---- INSERT at specific position ----
        trainConsist.add(2, "BG105");

        System.out.println("\nAfter inserting BG105 at position 2:");
        System.out.println(trainConsist);

        // ---- REMOVE from front ----
        trainConsist.remove(0);

        System.out.println("\nAfter removing front (Engine):");
        System.out.println(trainConsist);

        // ---- REMOVE from rear ----
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("\nAfter removing rear (Guard):");
        System.out.println(trainConsist);
    }
}