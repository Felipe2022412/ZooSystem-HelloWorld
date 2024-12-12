package interfaces;

/**
 * Interface for Zoo operations.
 */
public interface Zoo {

    /**
     *
     * Represents the available options in the main menu.
     */
    enum MenuOptions {
        LIST_ANIMALS, // Option to list all animals
        LIST_TYPES, // Option to list all unique animal types
        ADD_ANIMAL, // Option to add a new animal
        REMOVE_ANIMAL, // Option to remove an existing animal
        RANDOM_ANIMAL, // Option to retrieve a random animal
        MORE_OPTIONS, // Option to access additional submenu options
        EXIT                // Option to exit the program
    }

    /**
     *
     * Represents the additional options available in the submenu.
     */
    enum SubMenuOptions {
        LIST_SICK_ANIMALS, // Option to list all animals with health issues
        LIST_MALE_ANIMALS, // Option to list all male animals
        LIST_FEMALE_ANIMALS, // Option to list all female animals
        LIST_NEUTERED_ANIMALS, // Option to list all neutered animals
        LIST_HERBIVORE_ANIMALS, // Option to list all herbivorous animals
        LIST_OMNIVORE_ANIMALS, // Option to list all omnivorous animals
        LIST_CARNIVORE_ANIMALS, // Option to list all carnivorous animals
        LIST_HUNGRY_ANIMALS, // Option to list all hungry animals
        RETURN_TO_MAIN_MENU     // Option to return to the main menu
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
