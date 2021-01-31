package commandPattern.Fernseher;




import java.util.HashMap;
import java.util.Stack;

public class Fernbedienung {
    HashMap<Integer, Command> knoepfe;
    Stack<Command> history;
    public Fernbedienung() {
        knoepfe = new HashMap<Integer, Command>();
        history = new Stack<Command>();
    }

    // Eine Methode um der Taste ein Kommando zuzuweisen
    // kann durch Mehrfaches Aufrufen Kommando verändern
    public void setKommando (Integer position, Command k){
        knoepfe.put(position, k);
    }

    public void knopfGedrueckt (Integer key){
        if(knoepfe.get(key) != null){
            Command k = knoepfe.get(key);
            k.ausfuehren();
            history.push(k);
        }
    }

    public void  undoFernbedienung(){
        if(!history.isEmpty())
            history.pop().rueckgaengig();
    }
}
