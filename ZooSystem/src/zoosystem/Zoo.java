package zoosystem;

import animalsclasses.Animal;
import java.util.ArrayList;

/**
 * Interface for Zoo operations.
 */
public interface Zoo {

    enum MenuOptions {
        LIST_ANIMALS,       // List all animals
        LIST_TYPES,         // List all animal types
        ADD_ANIMAL,         // Add a new animal
        REMOVE_ANIMAL,      // Remove an animal
        RANDOM_ANIMAL,      // Get a random animal
        MORE_OPTIONS,       // Show more options
        EXIT                // Exit the program
    }

    enum SubMenuOptions {
        LIST_SICK_ANIMALS,
        LIST_MALE_ANIMALS,
        LIST_FEMALE_ANIMALS,
        LIST_NEUTERED_ANIMALS,
        LIST_HERBIVORE_ANIMALS,
        LIST_OMNIVORE_ANIMALS,
        LIST_CARNIVORE_ANIMALS,
        LIST_HUNGRY_ANIMALS,
        RETURN_TO_MAIN_MENU
    }

    // Method definitions

    void listAllAnimals();  // List all animals in the zoo

    void listAllTypes();  // List all unique animal types

    void addAnimal();  // Add an animal by its type

    void removeAnimal();  // Remove a specific animal by type

    void getRandom();  // Retrieve a random animal from any type

    void listSickAnimals();  // List all animals with health issues

    void listMaleAnimals();  // List all male animals

    void listFemaleAnimals();  // List all female animals

    void listNeuteredAnimals();  // List all neutered animals

    void listHerbivoreAnimals();  // List all herbivore animals

    void listOmnivoreAnimals();  // List all omnivore animals

    void listCarnivoreAnimals();  // List all carnivore animals

    void listHungryAnimals();  // List all hungry animals
}
