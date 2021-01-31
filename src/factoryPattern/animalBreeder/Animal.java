package factoryPattern.animalBreeder;

public abstract class Animal {
    //abstrakte ProductKlasse
     String name;

        void cuddle() {
        System.out.println("Cuddle " + name);
    }
        void wash() {
        System.out.println("Wash " + name);
    }
        void feed() {
        System.out.println("Give some food to " + name);
    }

        public String getName() {
        return name;
    }
}
