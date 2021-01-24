package strategiePattern.HundeVerhaltenAendern;

import strategiePattern.HundescharWieEnten.Laufverhalten;

public class LangsamLaufen implements Laufverhalten {
    @Override
    public void laufen() {
        System.out.println("langsam laufen");
    }
}
