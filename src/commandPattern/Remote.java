package commandPattern;



public class Remote {

    // Kann ein Kommando fuer eine Taste speichern
   Command slot;
    public Remote(){}

    // Eine Methode um der Taste ein Kommando zuzuweisen
    // kann durch Mehrfaches Aufrufen Kommando verändern
    public void setKommando(Command k)
    {
        slot = k;
    }

    // wird aufgerufen wenn Knopf auf
    // Fernbedienung gedrueckt wird
    public void knopfGedrueckt(){
        slot.ausfuehren();
    }
}
