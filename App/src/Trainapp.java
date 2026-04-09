import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

public class Trainapp {

    public static void main(String[] args) {

        // List of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical") ||
                                b.getCargo().equals("Petroleum")
                );

        // Output
        if (isSafe) {
            System.out.println("Train is SAFE");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}