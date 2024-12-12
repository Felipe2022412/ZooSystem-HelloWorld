package zoosystem;

import animalsclasses.Animal;
import interfacefunctions.*;

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

    @Override
    public void listSickAnimals() {
        System.out.println("\nSick Animals:");
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                if (!animal.isHealthStatus()) {
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }

    @Override
    public void listMaleAnimals() {
        System.out.println("\nMale Animals:");
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                if (animal.getGender().toString().equalsIgnoreCase("MALE")) {
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }

    @Override
    public void listFemaleAnimals() {
        System.out.println("\nFemale Animals:");
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                if (animal.getGender().toString().equalsIgnoreCase("FEMALE")) {
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }

    @Override
    public void listNeuteredAnimals() {
        System.out.println("\nNeutered Animals:");
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                if (animal.isNeutered()) {
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }

    @Override
    public void listHerbivoreAnimals() {
        System.out.println("\nHerbivore Animals:");
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                if (animal.getDiet().toString().equalsIgnoreCase("HERBIVORES")) {
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }

    @Override
    public void listOmnivoreAnimals() {
        System.out.println("\nOmnivore Animals:");
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                if (animal.getDiet().toString().equalsIgnoreCase("OMNIVORES")) {
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }

    @Override
    public void listCarnivoreAnimals() {
        System.out.println("\nCarnivore Animals:");
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                if (animal.getDiet().toString().equalsIgnoreCase("CARNIVORES")) {
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }

    @Override
    public void listHungryAnimals() {
        System.out.println("\nHungry Animals:");
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                if (animal.isHungerStatus()) {
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }

    // Getter for animals
    public HashMap<String, ArrayList<Animal>> getAnimals() {
        return animals;
    }
}
