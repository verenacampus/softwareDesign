package commandPattern.Fernseher;

public class TVaus implements Command{

    Fernseher fernseher;

    public TVaus(Fernseher fernseher) {
        this.fernseher = fernseher;
    }

    @Override
    public void ausfuehren() {
        if(fernseher.istAn){
           fernseher.aus();
        }else
            System.out.println("Fernseher ist aus");
    }

    @Override
    public void rueckgaengig() {

    }
}
