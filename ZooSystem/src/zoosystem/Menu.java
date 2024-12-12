package zoosystem;

import zoomenufunctions.*;
import animalsclasses.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu implements Zoo {

    private HashMap<String, ArrayList<Animal>> animals;

    // Constructor
    public Menu(HashMap<String, ArrayList<Animal>> animals) {
        this.animals = animals;
    }

    // Main menu logic
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        Zoo.MenuOptions selectedOption = null;

        do {
            System.out.println("\nSelect an Option:");
            for (int i = 0; i < Zoo.MenuOptions.values().length; i++) {
                System.out.println((i + 1) + ". " + Zoo.MenuOptions.values()[i]);
            }

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option < 1 || option > Zoo.MenuOptions.values().length) {
                System.out.println("Invalid option. Please select a valid option.");
            } else {
                selectedOption = Zoo.MenuOptions.values()[option - 1];

                // Call overridden methods
                switch (selectedOption) {
                    case LIST_ANIMALS:
                        listAllAnimals();
                        break;
                    case LIST_TYPES:
                        listAllTypes();
                        break;
                    case ADD_ANIMAL:
                        addAnimal(); // Calls overridden method
                        break;
                    case REMOVE_ANIMAL:
                        removeAnimal(); // Calls overridden method
                        break;
                    case RANDOM_ANIMAL:
                        getRandom(); // Calls overridden method
                        break;
                    case MORE_OPTIONS:
                        showSubMenu();
                        break;
                    case EXIT:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Option not implemented yet.");
                }
            }
        } while (selectedOption != Zoo.MenuOptions.EXIT);
    }

    // Submenu
    private void showSubMenu() {
        Scanner scanner = new Scanner(System.in);
        Zoo.SubMenuOptions selectedOption = null;

        do {
            System.out.println("\nSelect a Sub-Option:");
            for (int i = 0; i < Zoo.SubMenuOptions.values().length; i++) {
                System.out.println((i + 1) + ". " + Zoo.SubMenuOptions.values()[i]);
            }

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option < 1 || option > Zoo.SubMenuOptions.values().length) {
                System.out.println("Invalid option. Please select a valid option.");
            } else {
                selectedOption = Zoo.SubMenuOptions.values()[option - 1];

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
        } while (selectedOption != Zoo.SubMenuOptions.RETURN_TO_MAIN_MENU);
    }

    // Overridden methods
    @Override
    public void listAllAnimals() {
        ListAllAnimals.listAllAnimals(animals); // Call the static method
    }

    @Override
    public void listAllTypes() {
        ListAllTypes.listAllTypes(animals); // Call the static method
    }

    @Override
    public void addAnimal() {
        AddAnimal.addAnimal(animals);
    }

    @Override
    public void removeAnimal() {
        RemoveAnimal.removeAnimal(animals); // Delegate the removal to the static utility method
    }

    @Override
    public void getRandom() {
        GetRandom.getRandomAnimal(animals); // Calls the static utility method
    }

    @Override
    public void listSickAnimals() {
        ListSickAnimals.listSickAnimals(animals);
    }

    @Override
    public void listMaleAnimals() {
        ListMaleAnimals.listMaleAnimals(animals);
    }

    @Override
    public void listFemaleAnimals() {
        ListFemaleAnimals.listFemaleAnimals(animals);
    }

    @Override
    public void listNeuteredAnimals() {
        ListNeuteredAnimals.listNeuteredAnimals(animals);
    }

    @Override
    public void listHerbivoreAnimals() {
        ListHerbivoreAnimals.listHerbivoreAnimals(animals);
    }

    @Override
    public void listOmnivoreAnimals() {
        ListOmnivoreAnimals.listOmnivoreAnimals(animals);
    }

    @Override
    public void listCarnivoreAnimals() {
        ListCarnivoreAnimals.listCarnivoreAnimals(animals);
    }

    @Override
    public void listHungryAnimals() {
        ListHungryAnimals.listHungryAnimals(animals);
    }

    // Getter for animals
    public HashMap<String, ArrayList<Animal>> getAnimals() {
        return animals;
    }
}
