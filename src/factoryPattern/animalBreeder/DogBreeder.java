package factoryPattern.animalBreeder;

public class DogBreeder extends AnimalBreeder{


    @Override
    public Animal breedAnimal(Breed breed, String name) {
        if(breed.equals(Breed.FOXHOUND)){
            return new Foxhound(name);
        } else if(breed.equals(Breed.WOLFHOUND)){
            return new Wolfhound(name);
        }else return null;
    }
}
