package zoomenufunctions;

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

    public static void addAnimal(HashMap<String, ArrayList<Animal>> animals) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Animal Type (e.g., Mammal, Bird, Fish, or a new one):");
        String type = IOUtils.getValidString(scanner);

        System.out.println("Enter the Animal Name:");
        String name = IOUtils.getValidString(scanner);

        System.out.println("Enter the Age:");
        int age = IOUtils.getValidInteger(scanner);

        System.out.println("Enter the Weight:");
        double weight = IOUtils.getValidDouble(scanner);

        // List and select Habitat
        System.out.println("Select the Habitat from the options below:");
        HabitatTypes[] habitats = HabitatTypes.values();
        for (int i = 0; i < habitats.length; i++) {
            System.out.println((i + 1) + ". " + habitats[i]);
        }
        System.out.print("Enter the number corresponding to the habitat: ");
        int habitatOption = IOUtils.getValidIntegerInRange(scanner, 1, habitats.length);
        HabitatTypes habitat = habitats[habitatOption - 1];

        System.out.println("Enter the Breed:");
        String breed = IOUtils.getValidString(scanner);

        System.out.println("Enter the Size:");
        double size = IOUtils.getValidDouble(scanner);

        // List and select Diet
        System.out.println("Select the Diet from the options below:");
        DietTypes[] diets = DietTypes.values();
        for (int i = 0; i < diets.length; i++) {
            System.out.println((i + 1) + ". " + diets[i]);
        }
        System.out.print("Enter the number corresponding to the diet: ");
        int dietOption = IOUtils.getValidIntegerInRange(scanner, 1, diets.length);
        DietTypes diet = diets[dietOption - 1];

        // List and select Gender
        System.out.println("Select the Gender from the options below:");
        GenderTypes[] genders = GenderTypes.values();
        for (int i = 0; i < genders.length; i++) {
            System.out.println((i + 1) + ". " + genders[i]);
        }
        System.out.print("Enter the number corresponding to the gender: ");
        int genderOption = IOUtils.getValidIntegerInRange(scanner, 1, genders.length);
        GenderTypes gender = genders[genderOption - 1];

        // Is Neutered
        System.out.println("Is the Animal Neutered?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        boolean neutered = IOUtils.getValidIntegerInRange(scanner, 1, 2) == 1;

        // Behaviour
        System.out.println("Enter the Behaviour:");
        String behaviour = IOUtils.getValidString(scanner);

        // Is Hungry
        System.out.println("Is the Animal Hungry?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        boolean hungerStatus = IOUtils.getValidIntegerInRange(scanner, 1, 2) == 1;

        // Is Healthy
        System.out.println("Is the Animal Healthy?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        boolean healthStatus = IOUtils.getValidIntegerInRange(scanner, 1, 2) == 1;

        // List and select Blood Type
        System.out.println("Select the Blood Type from the options below:");
        BloodyTypes[] bloodTypes = BloodyTypes.values();
        for (int i = 0; i < bloodTypes.length; i++) {
            System.out.println((i + 1) + ". " + bloodTypes[i]);
        }
        System.out.print("Enter the number corresponding to the blood type: ");
        int bloodTypeOption = IOUtils.getValidIntegerInRange(scanner, 1, bloodTypes.length);
        BloodyTypes bloodType = bloodTypes[bloodTypeOption - 1];

        // Create the new animal
        Animal newAnimal = new Animal(type, name, age, weight, habitat, breed, size, diet, gender, neutered, behaviour, hungerStatus, healthStatus, bloodType);

        // Add the animal to the HashMap
        animals.computeIfAbsent(type, k -> new ArrayList<>()).add(newAnimal);

        System.out.println("Animal has been added successfully!");
    }
}
