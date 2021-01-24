package observer.medienverlag;

public class EmailAbonnenten implements Beobachter{
    //MailAbonnenten wollen nur die Headline lesen, deshalb nur Titel
    private String titel;

    private Subjekt verlag;

    public EmailAbonnenten(Subjekt verlag) {
        this.verlag = verlag;
        verlag.registerObserver(this);
    }

    @Override
    public void update(String titel, String content) {
        this.titel = titel;
        readArticle();
    }

    private void readArticle() {
        System.out.println("MailAbonnenten lesen die neue Headline: " + titel);
    }
}
