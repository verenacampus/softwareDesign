package commandPattern.Fernseher;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Fernbedienung fernbedienung = new Fernbedienung();
        Fernseher fernseher = new Fernseher();
        KanalAb kanalAb = new KanalAb(fernseher);
        KanalAuf kanalAuf = new KanalAuf(fernseher);
        TVan tVan = new TVan(fernseher);
        TVaus tVaus = new TVaus(fernseher);

        fernbedienung.setKommando(1, kanalAuf);
        fernbedienung.setKommando(2, kanalAb);


        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String s = scanner.next();
                if (s.equals("x"))
                    break;
                try {
                    if (s.equals("undo")) {
                        fernbedienung.undoFernbedienung();
                    } else {
                        Integer key = Integer.parseInt(s);
                        fernbedienung.knopfGedrueckt(key);
                    }
                }catch (NumberFormatException e) {
                    System.out.println("Keine gültige Taste");
                }
            }
        }


    }
}
