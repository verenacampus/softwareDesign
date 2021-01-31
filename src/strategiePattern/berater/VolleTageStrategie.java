package strategiePattern.berater;

public class VolleTageStrategie implements IStrategie{
    @Override
    public double calc(Rechnung rechnung) {


        int helferlein = (int) (rechnung.getStunden()/8);

        int modulo = (int) (rechnung.getStunden()%8);
        if(modulo != 0){
            helferlein++;
        }


        return helferlein*rechnung.getBerater().getTagsatz();
    }
}
