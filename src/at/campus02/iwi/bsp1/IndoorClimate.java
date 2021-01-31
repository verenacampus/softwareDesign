package at.campus02.iwi.bsp1;

public class IndoorClimate implements SmartHomeObserver {
    private boolean shouldOpenWindows;
    private DataStore data;


    public IndoorClimate(DataStore data) {
        this.data = data;
        data.registerObserver(this);
        shouldOpenWindows = false;
    }

    public boolean isShouldOpenWindows() {
        return shouldOpenWindows;
    }


    @Override
    public void update() {
        if(data.getHumidity() >= 70){
            shouldOpenWindows = true;
            System.out.println("Fenster sind offen");
        } else {
            shouldOpenWindows = false;
            System.out.println("Fenster sind geschlossen");
        }
    }
}

