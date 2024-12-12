
package zoomenufunctions;


import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;

public class ListNeuteredAnimals {

    /*
     * Static method to list all neutered animals in the zoo.
     * Iterates through the HashMap and filters animals based on their neutered status.
     */
    public static void listNeuteredAnimals(HashMap<String, ArrayList<Animal>> animals) {
        System.out.println("\nNeutered Animals:");

        // Iterate through each list of animals in the HashMap
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                // Check if the animal is neutered
                if (animal.isNeutered()) {
                    // Print the animal's name and type
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }
}
