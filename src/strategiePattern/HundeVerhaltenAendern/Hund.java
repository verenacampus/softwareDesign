package strategiePattern.HundeVerhaltenAendern;

import strategiePattern.HundescharWieEnten.Bellverhalten;
import strategiePattern.HundescharWieEnten.Laufverhalten;

public abstract class Hund {
    // Instanzvariable für die Strategy (Komposition)
    // vom Typ des Interfaces -> Implementierungunabhängigkeit
    // Defaultverhalten: ConcreteStrategy: SchnellLaufen
    Laufverhalten laufverhalten = new SchnellLaufen();


    public Hund() {

        this.laufverhalten = laufverhalten;
    }

    public void setLaufverhalten(Laufverhalten laufverhalten) {
        this.laufverhalten = laufverhalten;
    }

    public void laufen (){
        //Delegation des Verhaltens an Verhaltensobjekt
        laufverhalten.laufen();
    }
}
