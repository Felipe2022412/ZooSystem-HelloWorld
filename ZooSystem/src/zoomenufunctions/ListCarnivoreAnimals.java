package zoomenufunctions;

import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;

public class ListCarnivoreAnimals {

    /*
     * Static method to list all carnivorous animals in the zoo.
     * Iterates through the HashMap and filters animals based on their diet type.
     */
    public static void listCarnivoreAnimals(HashMap<String, ArrayList<Animal>> animals) {
        System.out.println("\nCarnivore Animals:");

        // Iterate through each list of animals in the HashMap
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                // Check if the animal's diet is carnivorous
                if (animal.getDiet().toString().equalsIgnoreCase("CARNIVORES")) {
                    // Print the animal's name and type
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }
}
