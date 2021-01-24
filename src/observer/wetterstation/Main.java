package observer.wetterstation;

public class Main {
    public static void main(String[] args) {
        /*
        Definiert eine eins-zu-viele Abhängigkeit
        zwischen Objekten, sodass bei einer Änderung
        eines Objekts alle abhängigen Objekte informiert
        und aktualisiert werden.
         */

        /*
        Lose Kopplung:
        -) Subject weiß über Observer nur, dass Interface implementiert wird
        -) Neue Observer können während Laufzeit hinzugefügt werden
        -) Subject muss nicht angefasst werden um Observer hinzuzufügen
        -) Subjects und Observers können unabhängig weiterverwendet werden
        -) Änderung von Subject/Observer hat keinen Einfluss auf jeweils anderen
         */


        Wetterstation wetterstation = new Wetterstation();

        DigitalDisplay digitalDisplay = new DigitalDisplay(wetterstation);
        wetterstation.setMeasurements(20, 30, 40);
        //Konsole =>
        //          Digitalanzeige: 20.0
        System.out.println();
        SmartphoneDisplay smartphoneDisplay = new SmartphoneDisplay(wetterstation);
        wetterstation.setMeasurements(21, 31, 1000);
        //Konsole =>
        //          Digitalanzeige: 21.0
        //          Smartphone: 21.0 1000.0

    }
}
