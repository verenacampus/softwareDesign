package factoryPattern.animalBreeder;

public abstract class AnimalBreeder {
    //abstrakte Creator-Klasse


    //factory methode (= Code, der sich oft ändert)
    public abstract Animal breedAnimal(Breed breed, String name);

    // do not change this method signature
    //Aufruf der factory method
    public Animal deliverAnimal(Breed breed, String name) {

        Animal animal = breedAnimal(breed, name);

        // THIS PROCESS IS STANDARDIZED
        // DO NOT CHANGE THE FOLLOWING LINES
        animal.cuddle();
        animal.wash();
        animal.feed();
        animal.cuddle(); // second cuddle to get extremly happy animals

        return animal;
    }
}
