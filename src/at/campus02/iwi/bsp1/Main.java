package at.campus02.iwi.bsp1;

public class Main {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        AlarmSystem alarmSystem = new AlarmSystem(dataStore);
        IndoorClimate indoorClimate = new IndoorClimate(dataStore);

        dataStore.setHumidity(71);
    }
}
