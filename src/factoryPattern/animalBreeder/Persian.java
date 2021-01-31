package factoryPattern.animalBreeder;

public class Persian extends Animal{
    @Override
    void cuddle() {
        System.out.println("Perserkatze " + name + " schnurrt leise beim Streicheln.");
    }

    public Persian(String name) {
        this.name = name;
    }
}
