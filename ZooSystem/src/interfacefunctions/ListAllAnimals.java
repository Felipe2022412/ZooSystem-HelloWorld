package interfacefunctions;

import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Utility class for listing all animals in the zoo.
 */
public class ListAllAnimals {

    public static void listAllAnimals(HashMap<String, ArrayList<Animal>> animals) {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
            return;
        }

        System.out.println("\nAnimals in the Zoo:");
        for (String type : animals.keySet()) {
            System.out.println("\nType: " + type);
            ArrayList<Animal> animalList = animals.get(type);
            for (Animal animal : animalList) {
                System.out.println("- " + animal.getName());
            }
        }
    }
}
