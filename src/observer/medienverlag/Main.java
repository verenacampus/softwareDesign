package observer.medienverlag;

public class Main {
    /*
    Ein Medienverlag verfasst Nachrichtenartikel (bestehen aus Titel und Inhalt) =>
    in Chris' Lösung sehr clever: Artikel als eigene Klasse!
    und möchte diese an Print- und Email-AbonnentInnen ausliefern.
     */
    public static void main(String[] args) {
        Medienverlag m = new Medienverlag();
        Printabonnenten p = new Printabonnenten(m);
        m.neuerArtikel("neuerTitel", "neuerArtikel");
        // Konsole: =>
        //    Printabonnenten lesen den neuen Artikel: neuerTitel neuerArtikel
        System.out.println();

        EmailAbonnenten e = new EmailAbonnenten(m);

        m.neuerArtikel("shockingHeadline", "notSoShockingArticle");
        // =>
            //Printabonnenten lesen den neuen Artikel: shockingHeadline notSoShockingArticle
            //MailAbonnenten lesen die neue Headline: shockingHeadline

        //Printabonnent kündigt Abo
        m.removeObserver(p);
        System.out.println();

        m.neuerArtikel("immer weniger Printabonnenten", "Artikel über Abonnenten");
        //=> MailAbonnenten lesen die neue Headline: immer weniger Printabonnenten
    }
}
