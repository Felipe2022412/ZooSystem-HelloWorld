
package zoomenufunctions;


import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;

public class ListSickAnimals {

    /*
     * Static method to list all sick animals in the zoo.
     * Iterates through the HashMap and filters animals based on their health status.
     */
    public static void listSickAnimals(HashMap<String, ArrayList<Animal>> animals) {
        System.out.println("\nSick Animals:");

        // Iterate through each list of animals in the HashMap
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                // Check if the animal's health status is false (sick)
                if (!animal.isHealthStatus()) {
                    // Print the animal's name and type
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }
}
