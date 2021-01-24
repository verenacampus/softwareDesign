package strategiePattern.Enten;

public class Gummiente extends Ente {
    public Gummiente(String name) {
        super(name, null);
    }

    @Override
    public void anzeigen() {
        System.out.println(name + " ist scheu und lässt sich nicht blicken");

    }

    @Override
    public void quakt() {
        System.out.println(name + " macht quietsch quietsch");
    }

    @Override
    public void schwimmt() {
        System.out.println(name + " segelt im Seifenwasser durch die Badewanne");    }
}
