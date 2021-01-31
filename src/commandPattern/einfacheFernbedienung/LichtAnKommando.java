package commandPattern.einfacheFernbedienung;

public class LichtAnKommando  implements  Kommando{
    //ConcreteCommand
    Licht licht;

    public LichtAnKommando(Licht licht) {
        this.licht = licht;
    }



    @Override
    public void ausfuehren() {
    licht.an();
    }

}
