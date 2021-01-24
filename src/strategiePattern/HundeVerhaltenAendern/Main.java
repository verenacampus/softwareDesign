package strategiePattern.HundeVerhaltenAendern;

import strategiePattern.HundescharWieEnten.Laufverhalten;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hund> huskys = new ArrayList<Hund>();

        huskys.add(new Husky());
        huskys.add(new Husky());


        System.out.println("Alle Hunde laufen schnell");
        for (Hund h : huskys){
            h.laufen();
        }
        System.out.println();


        System.out.println("Neues Laufverhalten aller Hunde = langsamLaufen");
        for (Hund h : huskys){
            h.setLaufverhalten(new LangsamLaufen());
        }

        System.out.println("Alle Hunde laufen langsam");
        // alle Hunde laufen langsam
        for (Hund h : huskys){
            h.laufen();
        }
        System.out.println();
    }
}
