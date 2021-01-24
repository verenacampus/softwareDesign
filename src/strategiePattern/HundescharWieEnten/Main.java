package strategiePattern.HundescharWieEnten;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hund> hundeSchar = new ArrayList<Hund>();

        hundeSchar.add(new Dackel());
        hundeSchar.add(new Husky());
        hundeSchar.add(new RoboDog());

        for (Hund h : hundeSchar){
            h.bellt();
            h.laeuft();
        }


        /*
        Context = Hund
        Strategy-Interface = Bellverhalten + Laufverhalten
        Concrete Strategie = alle Bell- und Laufklassen
         */
    }
}
