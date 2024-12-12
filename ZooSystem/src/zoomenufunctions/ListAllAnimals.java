package zoomenufunctions;

import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;

public class ListAllAnimals {

    /*
     * Static method to list all animals in the zoo.
     * If no animals exist, it informs the user.
     */
    public static void listAllAnimals(HashMap<String, ArrayList<Animal>> animals) {
        // Check if the HashMap is empty
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
            return; // Exit if there are no animals
        }

        // Display animals grouped by type
        System.out.println("\nAnimals in the Zoo:");
        for (String type : animals.keySet()) { // Iterate through each animal type
            ArrayList<Animal> animalList = animals.get(type); // Get the list of animals for the type
            for (Animal animal : animalList) { // Iterate through the list of animals
                System.out.println("- " + animal.toStringMainInfos()); // Display main information about each animal
            }
        }
    }
}
