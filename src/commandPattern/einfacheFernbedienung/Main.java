package commandPattern.einfacheFernbedienung;

public class Main {
    public static void main(String[] args) {
        EinfacheFernbedienung fb = new EinfacheFernbedienung();
        Licht licht = new Licht();

        LichtAnKommando lk = new LichtAnKommando(licht);

        fb.setKommando(lk);
        fb.knopfGedrueckt();
    }
}
