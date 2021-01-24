package commandPattern;



public class Main {
    // Das ist unser Klient im Pattern
    public static void main(String[] args) {
/*
        // Fernbedienung ist unser Aufrufer (invoker)
        commandPattern.simpleFernbedienung.EinfacheFernbedienung fb = new EinfacheFernbedienung();

        commandPattern.simpleFernbedienung.Licht licht = new Licht();

        // geben Empfänger beim Konstruktor mit
        commandPattern.simpleFernbedienung.LichtAnKommando lK = new LichtAnKommando(licht);

        // weisen ein Kommando dem Aufrufer zu
        fb.setKommando(lK);

        // simulieren knopf drücken
        fb.knopfGedrueckt();

 */

        Remote remote = new Remote();
        TV tv  = new TV();
        KanalAuf kanalAuf = new KanalAuf(tv);
        remote.setKommando(kanalAuf);
        remote.knopfGedrueckt();
        remote.knopfGedrueckt();
        remote.knopfGedrueckt();
        remote.knopfGedrueckt();
    }




}
