package zoosystem;

import animalsclasses.Animal;
import interfacefunctions.AddAnimal;
import interfacefunctions.ListAllAnimals;

import java.util.List;
import java.util.Scanner;

public class Menu implements Zoo {

    private List<Animal> animals;

    public Menu(List<Animal> animals) {
        this.animals = animals;
    }

   
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

                switch (selectedOption) {
                    case LIST_ANIMALS:
                        listAllAnimals(animals);
                        break;
                    case LIST_TYPES:
                        listAllTypes(animals);
                        break;
                    case ADD_ANIMAL:
                        AddAnimal.addAnimal(animals);
                        break;
                    case REMOVE_ANIMAL:
                        removeAnimalFromMenu();
                        break;
                    case RANDOM_ANIMAL:
                        getRandom(animals);
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

    //DONE
    @Override
    public void listAllAnimals(List<Animal> animals) {
        ListAllAnimals.listAllAnimals(animals);
    }

    @Override
    public void listAllTypes(List<Animal> animals) {
        System.out.println("\nAnimal Types in the Zoo:");
        animals.stream()
                .map(Animal::getType)
                .distinct()
                .forEach(System.out::println);
    }

    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Animal added successfully: " + animal.getName());
    }

    @Override
    public void removeAnimal(Animal animal) {
        if (animals.remove(animal)) {
            System.out.println("Animal removed successfully: " + animal.getName());
        } else {
            System.out.println("Animal not found in the zoo.");
        }
    }

    private void removeAnimalFromMenu() {
        Scanner scanner = new Scanner(System.in);
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo to remove.");
            return;
        }
        System.out.println("\nSelect an Animal to Remove:");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println((i + 1) + ". " + animals.get(i).getName());
        }
        System.out.print("Enter the number corresponding to the animal: ");
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= animals.size()) {
            removeAnimal(animals.get(choice - 1));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    @Override
    public void getRandom(List<Animal> animals) {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
        } else {
            Animal randomAnimal = animals.get((int) (Math.random() * animals.size()));
            System.out.println("\nRandom Animal:");
            System.out.println(randomAnimal.getName() + " (" + randomAnimal.getType() + ")");
        }
    }

    @Override
    public void listSickAnimals(List<Animal> animals) {
        System.out.println("\nSick Animals:");
        animals.stream()
                .filter(animal -> !animal.isHealthStatus())
                .forEach(animal -> System.out.println(animal.getName() + " (" + animal.getType() + ")"));
    }

    @Override
    public void listMaleAnimals(List<Animal> animals) {
        System.out.println("\nMale Animals:");
        animals.stream()
                .filter(animal -> animal.getGender().toString().equalsIgnoreCase("MALE"))
                .forEach(animal -> System.out.println(animal.getName() + " (" + animal.getType() + ")"));
    }

    @Override
    public void listFemaleAnimals(List<Animal> animals) {
        System.out.println("\nFemale Animals:");
        animals.stream()
                .filter(animal -> animal.getGender().toString().equalsIgnoreCase("FEMALE"))
                .forEach(animal -> System.out.println(animal.getName() + " (" + animal.getType() + ")"));
    }

    @Override
    public void listNeuteredAnimals(List<Animal> animals) {
        System.out.println("\nNeutered Animals:");
        animals.stream()
                .filter(Animal::isNeutered)
                .forEach(animal -> System.out.println(animal.getName() + " (" + animal.getType() + ")"));
    }

    @Override
    public void listHerbivoreAnimals(List<Animal> animals) {
        System.out.println("\nHerbivore Animals:");
        animals.stream()
                .filter(animal -> animal.getDiet().toString().equalsIgnoreCase("HERBIVORES"))
                .forEach(animal -> System.out.println(animal.getName() + " (" + animal.getType() + ")"));
    }

    @Override
    public void listOmnivoreAnimals(List<Animal> animals) {
        System.out.println("\nOmnivore Animals:");
        animals.stream()
                .filter(animal -> animal.getDiet().toString().equalsIgnoreCase("OMNIVORES"))
                .forEach(animal -> System.out.println(animal.getName() + " (" + animal.getType() + ")"));
    }

    @Override
    public void listCarnivoreAnimals(List<Animal> animals) {
        System.out.println("\nCarnivore Animals:");
        animals.stream()
                .filter(animal -> animal.getDiet().toString().equalsIgnoreCase("CARNIVORES"))
                .forEach(animal -> System.out.println(animal.getName() + " (" + animal.getType() + ")"));
    }

    @Override
    public void listHungryAnimals(List<Animal> animals) {
        System.out.println("\nHungry Animals:");
        animals.stream()
                .filter(Animal::isHungerStatus)
                .forEach(animal -> System.out.println(animal.getName() + " (" + animal.getType() + ")"));
    }

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
                        listSickAnimals(animals);
                        break;
                    case LIST_MALE_ANIMALS:
                        listMaleAnimals(animals);
                        break;
                    case LIST_FEMALE_ANIMALS:
                        listFemaleAnimals(animals);
                        break;
                    case LIST_NEUTERED_ANIMALS:
                        listNeuteredAnimals(animals);
                        break;
                    case LIST_HERBIVORE_ANIMALS:
                        listHerbivoreAnimals(animals);
                        break;
                    case LIST_OMNIVORE_ANIMALS:
                        listOmnivoreAnimals(animals);
                        break;
                    case LIST_CARNIVORE_ANIMALS:
                        listCarnivoreAnimals(animals);
                        break;
                    case LIST_HUNGRY_ANIMALS:
                        listHungryAnimals(animals);
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
}
