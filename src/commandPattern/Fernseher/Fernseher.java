package commandPattern.Fernseher;

public class Fernseher {

    private int kanal;
    public boolean istAn;

    public int getKanal() {
        return kanal;
    }

    public void setKanal(int kanal) {
        if(kanal >=1 && kanal <= 40){
        this.kanal = kanal;
        System.out.println("Kanal: " + getKanal());}
        else System.out.println("Ungültige Eingabe");
    }

    public Fernseher() {
       istAn= false;
    }

    public void an(){
        istAn = true;
        System.out.println("TV ist an");
    }
    public void aus(){
        istAn = false;
        System.out.println("TV ist aus");
    }
}
