
package zoomenufunctions;

// Import necessary classes
import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;

public class ListOmnivoreAnimals {

    /*
     * Static method to list all omnivorous animals in the zoo.
     * Iterates through the HashMap and filters animals based on their diet type.
     */
    public static void listOmnivoreAnimals(HashMap<String, ArrayList<Animal>> animals) {
        System.out.println("\nOmnivore Animals:");

        // Iterate through each list of animals in the HashMap
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                // Check if the animal's diet is omnivorous
                if (animal.getDiet().toString().equalsIgnoreCase("OMNIVORES")) {
                    // Print the animal's name and type
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }
}
