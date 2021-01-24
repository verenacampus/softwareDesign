package commandPattern;

public class TV {
   private int Kanal;

    public void on() {
        System.out.println("TV ist an");
    }
    public void off() {
        System.out.println("TV ist aus");
    }

    public int getKanal() {
        return Kanal;
    }

    public void setKanal(int kanal) {
        Kanal = kanal;
    }
}
