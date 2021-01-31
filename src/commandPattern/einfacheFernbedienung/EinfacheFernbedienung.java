package commandPattern.einfacheFernbedienung;

public class EinfacheFernbedienung {
    //invoker
    Kommando slot;

    public EinfacheFernbedienung(){};

    public void setKommando(Kommando k){
        slot = k;
    }

    public void knopfGedrueckt(){
        slot.ausfuehren();
    }
}
