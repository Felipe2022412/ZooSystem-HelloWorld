/*
 * Class containing the function to add a new animal to the zoo system.
 */
package zoomenufunctions;

// Import necessary classes and enums
import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import Enums.NaturalHabitatType.HabitatTypes;
import Enums.Diet.DietTypes;
import Enums.Gender.GenderTypes;
import Enums.BloodyType.BloodyTypes;
import utils.IOUtils;

public class AddAnimal {

    /*
     * Static method to add a new animal to the zoo system.
     * Prompts the user for various attributes of the animal, validates inputs,
     * and adds the new animal to the specified type in the HashMap.
     */
    public static void addAnimal(HashMap<String, ArrayList<Animal>> animals) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the animal type
        System.out.println("Enter the Animal Type (e.g., Mammal, Bird, Fish, or a new one):");
        String type = IOUtils.getValidString(scanner);

        // Prompt for the animal name
        System.out.println("Enter the Animal Name:");
        String name = IOUtils.getValidString(scanner);

        // Prompt for the animal age
        System.out.println("Enter the Age:");
        int age = IOUtils.getValidInteger(scanner);

        // Prompt for the animal weight
        System.out.println("Enter the Weight:");
        double weight = IOUtils.getValidDouble(scanner);

        // Prompt for the habitat type
        System.out.println("Select the Habitat from the options below:");
        HabitatTypes[] habitats = HabitatTypes.values();
        for (int i = 0; i < habitats.length; i++) {
            System.out.println((i + 1) + ". " + habitats[i]);
        }
        System.out.print("Enter the number corresponding to the habitat: ");
        int habitatOption = IOUtils.getValidIntegerInRange(scanner, 1, habitats.length);
        HabitatTypes habitat = habitats[habitatOption - 1];

        // Prompt for the breed or species
        System.out.println("Enter the Breed:");
        String breed = IOUtils.getValidString(scanner);

        // Prompt for the animal size
        System.out.println("Enter the Size:");
        double size = IOUtils.getValidDouble(scanner);

        // Prompt for the diet type
        System.out.println("Select the Diet from the options below:");
        DietTypes[] diets = DietTypes.values();
        for (int i = 0; i < diets.length; i++) {
            System.out.println((i + 1) + ". " + diets[i]);
        }
        System.out.print("Enter the number corresponding to the diet: ");
        int dietOption = IOUtils.getValidIntegerInRange(scanner, 1, diets.length);
        DietTypes diet = diets[dietOption - 1];

        // Prompt for the gender
        System.out.println("Select the Gender from the options below:");
        GenderTypes[] genders = GenderTypes.values();
        for (int i = 0; i < genders.length; i++) {
            System.out.println((i + 1) + ". " + genders[i]);
        }
        System.out.print("Enter the number corresponding to the gender: ");
        int genderOption = IOUtils.getValidIntegerInRange(scanner, 1, genders.length);
        GenderTypes gender = genders[genderOption - 1];

        // Prompt for neutered status
        System.out.println("Is the Animal Neutered?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        boolean neutered = IOUtils.getValidIntegerInRange(scanner, 1, 2) == 1;

        // Prompt for behavioral traits
        System.out.println("Enter the Behaviour:");
        String behaviour = IOUtils.getValidString(scanner);

        // Prompt for hunger status
        System.out.println("Is the Animal Hungry?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        boolean hungerStatus = IOUtils.getValidIntegerInRange(scanner, 1, 2) == 1;

        // Prompt for health status
        System.out.println("Is the Animal Healthy?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        boolean healthStatus = IOUtils.getValidIntegerInRange(scanner, 1, 2) == 1;

        // Prompt for blood type
        System.out.println("Select the Blood Type from the options below:");
        BloodyTypes[] bloodTypes = BloodyTypes.values();
        for (int i = 0; i < bloodTypes.length; i++) {
            System.out.println((i + 1) + ". " + bloodTypes[i]);
        }
        System.out.print("Enter the number corresponding to the blood type: ");
        int bloodTypeOption = IOUtils.getValidIntegerInRange(scanner, 1, bloodTypes.length);
        BloodyTypes bloodType = bloodTypes[bloodTypeOption - 1];

        // Create the new animal object with all attributes
        Animal newAnimal = new Animal(type, name, age, weight, habitat, breed, size, diet, gender, neutered, behaviour, hungerStatus, healthStatus, bloodType);

        // Add the new animal to the HashMap, initializing the type's list if necessary
        animals.computeIfAbsent(type, k -> new ArrayList<>()).add(newAnimal);

        // Confirmation message
        System.out.println("Animal has been added successfully!");
    }
}
