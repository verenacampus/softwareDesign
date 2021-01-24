package strategiePattern.Enten;

public abstract class Ente {
    protected String name;
    Flugverhalten flugverhalten;

    public Ente(String name, Flugverhalten flugverhalten) {
        this.name = name;
        this.flugverhalten = flugverhalten;
    }


    public  void quakt() {
        System.out.println("Ente " + name + " quakt");
    }
    public void schwimmt()
    {
        System.out.println("Ente schwimmt");
    }

    public void fliegt() {
        if (flugverhalten != null){
            flugverhalten.fliegen();
        }
    }

    public abstract void anzeigen();




}
