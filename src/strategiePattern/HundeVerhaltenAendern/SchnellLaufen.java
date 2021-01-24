package strategiePattern.HundeVerhaltenAendern;

import strategiePattern.HundescharWieEnten.Laufverhalten;

public class SchnellLaufen implements Laufverhalten {

    @Override
    public void laufen() {
        System.out.println("schnell laufen");
    }
}
