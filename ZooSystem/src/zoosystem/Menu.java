package zoosystem;


import interfaces.Zoo; 
import zoomenufunctions.*; 
import animalsclasses.Animal; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner; 
import utils.IOUtils; 

// Menu class implements the Zoo interface
public class Menu implements Zoo {

    // HashMap to store categorized animals
    private HashMap<String, ArrayList<Animal>> animals;

    // Constructor to initialize the Menu with the given animals HashMap
    public Menu(HashMap<String, ArrayList<Animal>> animals) {
        this.animals = animals;
    }

    // Main menu logic
    public void showMenu() {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        Zoo.MenuOptions selectedOption = null; // Variable to hold the selected option

        do {
            // Display menu options
            System.out.println("\nSelect an Option:");
            for (int i = 0; i < Zoo.MenuOptions.values().length; i++) {
                System.out.println((i + 1) + ". " + Zoo.MenuOptions.values()[i]);
            }

            // Get a valid integer input from the user
            int option = IOUtils.getValidInteger(scanner);

            // Validate the option and process it
            if (option < 1 || option > Zoo.MenuOptions.values().length) {
                System.out.println("Invalid option. Please select a valid option.");
            } else {
                // Map user input to the corresponding enum value
                selectedOption = Zoo.MenuOptions.values()[option - 1];

                // Perform action based on selected menu option
                switch (selectedOption) {
                    case LIST_ANIMALS:
                        listAllAnimals();
                        break;
                    case LIST_TYPES:
                        listAllTypes();
                        break;
                    case ADD_ANIMAL:
                        addAnimal(); // Add a new animal
                        break;
                    case REMOVE_ANIMAL:
                        removeAnimal(); // Remove an existing animal
                        break;
                    case RANDOM_ANIMAL:
                        getRandom(); // Get a random animal
                        break;
                    case MORE_OPTIONS:
                        showSubMenu(); // Navigate to the submenu
                        break;
                    case EXIT:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Option not implemented yet.");
                }
            }
        } while (selectedOption != Zoo.MenuOptions.EXIT); // Exit when the user selects EXIT
    }

    // Submenu logic
    private void showSubMenu() {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        Zoo.SubMenuOptions selectedOption = null; // Variable to hold the selected submenu option

        do {
            // Display submenu options
            System.out.println("\nSelect a Sub-Option:");
            for (int i = 0; i < Zoo.SubMenuOptions.values().length; i++) {
                System.out.println((i + 1) + ". " + Zoo.SubMenuOptions.values()[i]);
            }

            // Get a valid integer input from the user
            int option = IOUtils.getValidInteger(scanner);
            scanner.nextLine(); // Consume the newline character

            // Validate the option and process it
            if (option < 1 || option > Zoo.SubMenuOptions.values().length) {
                System.out.println("Invalid option. Please select a valid option.");
            } else {
                // Map user input to the corresponding enum value
                selectedOption = Zoo.SubMenuOptions.values()[option - 1];

                // Perform action based on selected submenu option
                switch (selectedOption) {
                    case LIST_SICK_ANIMALS:
                        listSickAnimals();
                        break;
                    case LIST_MALE_ANIMALS:
                        listMaleAnimals();
                        break;
                    case LIST_FEMALE_ANIMALS:
                        listFemaleAnimals();
                        break;
                    case LIST_NEUTERED_ANIMALS:
                        listNeuteredAnimals();
                        break;
                    case LIST_HERBIVORE_ANIMALS:
                        listHerbivoreAnimals();
                        break;
                    case LIST_OMNIVORE_ANIMALS:
                        listOmnivoreAnimals();
                        break;
                    case LIST_CARNIVORE_ANIMALS:
                        listCarnivoreAnimals();
                        break;
                    case LIST_HUNGRY_ANIMALS:
                        listHungryAnimals();
                        break;
                    case RETURN_TO_MAIN_MENU:
                        System.out.println("Returning to Main Menu...");
                        return;
                    default:
                        System.out.println("Option not implemented yet.");
                }
            }
        } while (selectedOption != Zoo.SubMenuOptions.RETURN_TO_MAIN_MENU); // Exit when returning to main menu
    }

    // Overridden methods from the Zoo interface
    // All methods have their own class to respect the single-responsibility principle (SRP)

    @Override
    public void listAllAnimals() {
        ListAllAnimals.listAllAnimals(animals); // List all animals using a static utility method
    }

    @Override
    public void listAllTypes() {
        ListAllTypes.listAllTypes(animals); // List all types of animals using a static utility method
    }

    @Override
    public void addAnimal() {
        AddAnimal.addAnimal(animals); // Add a new animal using a static utility method
    }

    @Override
    public void removeAnimal() {
        RemoveAnimal.removeAnimal(animals); // Remove an animal using a static utility method
    }

    @Override
    public void getRandom() {
        GetRandom.getRandomAnimal(animals); // Get a random animal using a static utility method
    }

    @Override
    public void listSickAnimals() {
        ListSickAnimals.listSickAnimals(animals); // List all sick animals
    }

    @Override
    public void listMaleAnimals() {
        ListMaleAnimals.listMaleAnimals(animals); // List all male animals
    }

    @Override
    public void listFemaleAnimals() {
        ListFemaleAnimals.listFemaleAnimals(animals); // List all female animals
    }

    @Override
    public void listNeuteredAnimals() {
        ListNeuteredAnimals.listNeuteredAnimals(animals); // List all neutered animals
    }

    @Override
    public void listHerbivoreAnimals() {
        ListHerbivoreAnimals.listHerbivoreAnimals(animals); // List all herbivorous animals
    }

    @Override
    public void listOmnivoreAnimals() {
        ListOmnivoreAnimals.listOmnivoreAnimals(animals); // List all omnivorous animals
    }

    @Override
    public void listCarnivoreAnimals() {
        ListCarnivoreAnimals.listCarnivoreAnimals(animals); // List all carnivorous animals
    }

    @Override
    public void listHungryAnimals() {
        ListHungryAnimals.listHungryAnimals(animals); // List all hungry animals
    }

    // Getter for the animals HashMap
    public HashMap<String, ArrayList<Animal>> getAnimals() {
        return animals;
    }
}
