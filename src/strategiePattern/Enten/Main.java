package strategiePattern.Enten;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ente>ententeich = new ArrayList<Ente>();
        ententeich.add(new Stockente("Donald"));
        ententeich.add(new Rotkopfente("Daisy"));
        ententeich.add(new Stockente("Dagobert"));
        ententeich.add(new Gummiente("Sir Quietschalot"));

        for (Ente e : ententeich){
            e.anzeigen();
            e.fliegt();
        }

        /*
        Interface Strategie + methdode();
        KonkreteStrategien implementieren Interface + überschreiben methode()

        abstract Class Ente
        hat Attribut Strategie auch im Konstruktor
        Methode in Ente:
        wenn KonkreteStrategie vorhanden, konkreteStrategie ist methode aus Interface

        */



    }
}
