package factoryPattern.animalBreeder;

public class CatBreeder  extends AnimalBreeder {
    @Override
    public Animal breedAnimal(Breed breed, String name) {
        if(breed.equals(Breed.PERSIAN)){
            return new Persian(name);
        }else if(breed.equals(Breed.BENGAL)){
            return new Bengal(name);
        }else return null;
    }
}
