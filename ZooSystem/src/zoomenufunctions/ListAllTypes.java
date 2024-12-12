package zoomenufunctions;

import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ListAllTypes {

    /*
     * Static method to list all unique animal types in the zoo.
     * If no animal types exist, it informs the user.
     */
    public static void listAllTypes(HashMap<String, ArrayList<Animal>> animals) {
        // Check if the HashMap is empty
        if (animals.isEmpty()) {
            System.out.println("No animal types available in the zoo.");
            return; // Exit if there are no animal types
        }

        // Collect all unique types from the keys of the HashMap
        Set<String> uniqueTypes = new HashSet<>(animals.keySet());

        // Display the unique animal types
        System.out.println("\nAnimal Types in the Zoo:");
        for (String type : uniqueTypes) { // Iterate through the set of unique types
            System.out.println(type); // Print each type
        }
    }
}
