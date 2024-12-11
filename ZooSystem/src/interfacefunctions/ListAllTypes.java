package interfacefunctions;

import animalsclasses.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Utility class to list all animal types.
 */
public class ListAllTypes {

    public static void listAllTypes(HashMap<String, ArrayList<Animal>> animals) {
        if (animals.isEmpty()) {
            System.out.println("No animal types available in the zoo.");
            return;
        }

        // Collect all unique types from the keys of the HashMap
        Set<String> uniqueTypes = new HashSet<>(animals.keySet());

        // Display all unique types
        System.out.println("\nAnimal Types in the Zoo:");
        for (String type : uniqueTypes) {
            System.out.println(type);
        }
    }
}
