package strategiePattern.HundescharWieEnten;

public abstract class Hund {
    Bellverhalten bellverhalten;
    Laufverhalten laufverhalten;


    public Hund(Bellverhalten bellverhalten, Laufverhalten laufverhalten) {
        this.bellverhalten = bellverhalten;
        this.laufverhalten = laufverhalten;
    }

    public void bellt(){
        if (bellverhalten != null){
            bellverhalten.bellen();
        }
    }

    public void laeuft(){
        if (laufverhalten != null){
            laufverhalten.laufen();
        }
    }



}
