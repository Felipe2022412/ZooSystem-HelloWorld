package zoomenufunctions;

import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;

public class ListHungryAnimals {

    /*
     * Static method to list all hungry animals in the zoo.
     * Iterates through the HashMap and filters animals based on their hunger status.
     */
    public static void listHungryAnimals(HashMap<String, ArrayList<Animal>> animals) {
        System.out.println("\nHungry Animals:");

        // Iterate through each list of animals in the HashMap
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                // Check if the animal's hunger status is true
                if (animal.isHungerStatus()) {
                    // Print the animal's name and type
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }
}
