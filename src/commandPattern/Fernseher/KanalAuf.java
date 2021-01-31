package commandPattern.Fernseher;



public class KanalAuf implements Command {
    Fernseher fernseher;

    public KanalAuf(Fernseher fernseher) {
        this.fernseher = fernseher;
    }

    @Override
    public void ausfuehren() {
        if(fernseher.istAn == false){
            fernseher.an();
            fernseher.setKanal(1);
        } else if(fernseher.getKanal() == 40){
            fernseher.setKanal(1);
        }else {
            fernseher.setKanal(fernseher.getKanal() +1);
        }
    }

    @Override
    public void rueckgaengig() {
        if(fernseher.getKanal() == 1){
            fernseher.setKanal(40);
        }else {
            fernseher.setKanal(fernseher.getKanal() -1);
        }
    }


}
