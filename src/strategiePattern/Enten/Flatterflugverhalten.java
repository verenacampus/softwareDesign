package strategiePattern.Enten;

public class Flatterflugverhalten implements Flugverhalten {

    @Override
    public void fliegen() {
        System.out.println("Ente flattert");
    }
}
