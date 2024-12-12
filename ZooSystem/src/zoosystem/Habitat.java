package zoosystem;

import Enums.NaturalHabitatType; 
import animalsclasses.Animal;    
import java.util.ArrayList;
import java.util.List;

public class Habitat {

    private NaturalHabitatType.HabitatTypes habitatType; // Enum to specify the habitat type
    private List<Animal> animalList; // List to store animals in the habitat

    // Constructor to initialize the habitat with a specific type
    public Habitat(NaturalHabitatType.HabitatTypes habitatType) {
        this.habitatType = habitatType;
        this.animalList = new ArrayList<>(); // Initialize an empty list of animals
    }

    // Method to get all animals in the habitat
    public List<Animal> getAnimals() {
        return animalList; // Return the list of animals
    }

    // Method to add an animal to the habitat
    public void addAnimal(Animal animal) {
        animalList.add(animal); // Add the animal to the list
        System.out.println(animal.getName() + " adicionado ao habitat " + habitatType + "."); // Confirmation message
    }

    // Method to remove an animal from the habitat
    public void removeAnimal(Animal animal) {
        // Attempt to remove the animal and provide feedback
        if (animalList.remove(animal)) {
            System.out.println(animal.getName() + " removido do habitat " + habitatType + ".");
        } else {
            System.out.println(animal.getName() + " não encontrado no habitat " + habitatType + ".");
        }
    }

    // Method to get the type of habitat
    public NaturalHabitatType.HabitatTypes getHabitatType() {
        return habitatType; // Return the habitat type
    }

    // Method to simulate cleaning the habitat
    public void cleanHabitat() {
        System.out.println("Limpando o habitat " + habitatType + "..."); // Print cleaning message
    }
}
