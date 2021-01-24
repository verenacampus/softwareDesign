package observer.medienverlag;

import observer.wetterstation.Observer;

import java.util.ArrayList;

public class Medienverlag implements Subjekt {
    private String titel;
    private String content;

    private ArrayList<Beobachter> abonnenten;

    public Medienverlag() {
        abonnenten= new ArrayList<Beobachter>();
    }


    @Override
    public void registerObserver(Beobachter beobachter) {
        abonnenten.add(beobachter);
    }

    @Override
    public void removeObserver(Beobachter beobachter) {
    abonnenten.remove(beobachter);
    }

    public void neuerArtikel (String t, String c){
        titel = t;
        content = c;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Beobachter b : abonnenten){
            b.update(titel, content);
        }
    }

}
