package factoryPattern.animalBreeder;

public class Bengal extends Animal{
    @Override
    void cuddle() {
        System.out.println("Bengalkatze " + name + " schnurrt laut beim Streicheln.");
    }

    public Bengal(String name) {
        this.name = name;

    }
}
