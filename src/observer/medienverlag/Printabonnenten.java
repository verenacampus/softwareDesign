package observer.medienverlag;

public class Printabonnenten implements Beobachter {
    private String titel;
    private String content;
    private Subjekt verlag;

    public Printabonnenten(Subjekt verlag) {
        this.verlag = verlag;
        verlag.registerObserver(this);
    }

    @Override
    public void update(String titel, String content) {
        this.titel = titel;
        this.content = content;
        readArticle();
    }

    private void readArticle() {
        System.out.println("Printabonnenten lesen den neuen Artikel: " + titel + " "+ content);

    }
}
