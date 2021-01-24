package commandPattern;

public class KanalAuf implements Command{

    TV tv;


    public KanalAuf(TV tv) {
        this.tv = tv;
    }

    @Override
    public void ausfuehren() {

        System.out.println("currentKanal: " + tv.getKanal());

       int currentKanal = tv.getKanal();
       currentKanal++;
       tv.setKanal(currentKanal);
        System.out.println("KanalAuf: " + currentKanal);
        System.out.println();
    }
}
