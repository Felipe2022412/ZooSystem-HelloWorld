/*
 * Utility class for removing an animal from the zoo.
 * Allows the user to select and remove an animal from the zoo's collection.
 */
package zoomenufunctions;

// Import necessary classes
import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveAnimal {

    /*
     * Static method to remove an animal from the zoo.
     * Prompts the user to select an animal from the available list and removes it.
     */
    public static void removeAnimal(HashMap<String, ArrayList<Animal>> animals) {
        Scanner scanner = new Scanner(System.in);

        // Check if the HashMap is empty
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo to remove.");
            return; // Exit if there are no animals
        }

        // Display the list of animals and map them to a selection number
        System.out.println("\nSelect an Animal to Remove:");
        int count = 1;
        HashMap<Integer, Animal> animalMap = new HashMap<>(); // Map selection number to Animal
        HashMap<Integer, String> typeMap = new HashMap<>();   // Map selection number to Animal type

        // Populate the selection mappings
        for (String type : animals.keySet()) {
            ArrayList<Animal> animalList = animals.get(type);
            for (int i = 0; i < animalList.size(); i++) {
                Animal animal = animalList.get(i);
                System.out.println(count + ". " + animal.getName() + " (" + type + ")");
                animalMap.put(count, animal); // Map the count to the animal
                typeMap.put(count, type);    // Map the count to the type
                count++;
            }
        }

        // Prompt the user to select an animal to remove
        System.out.print("Enter the number corresponding to the animal: ");
        int choice = scanner.nextInt();

        // Retrieve and remove the selected animal
        if (animalMap.containsKey(choice)) {
            Animal selectedAnimal = animalMap.get(choice); // Get the selected animal
            String selectedType = typeMap.get(choice);     // Get the animal's type

            // Remove the animal from the appropriate type list
            animals.get(selectedType).remove(selectedAnimal);
            System.out.println("Animal removed successfully: " + selectedAnimal.getName());

            // If no animals remain for the type, remove the type from the HashMap
            if (animals.get(selectedType).isEmpty()) {
                animals.remove(selectedType);
            }
        } else {
            System.out.println("Invalid choice."); // Handle invalid input
        }
    }
}
