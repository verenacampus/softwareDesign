package commandPattern.Fernseher;

public class TVan implements Command {
    Fernseher fernseher;

    public TVan(Fernseher fernseher) {
        this.fernseher = fernseher;
    }

    @Override
    public void ausfuehren() {
        if (fernseher.istAn){
            System.out.println("Fernseher ist an");
            return;
        } else {
            fernseher.an();
        }
    }

    @Override
    public void rueckgaengig() {

    }
}
