
package zoomenufunctions;


import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;

public class ListMaleAnimals {

    /*
     * Static method to list all male animals in the zoo.
     * Iterates through the HashMap and filters animals based on their gender.
     */
    public static void listMaleAnimals(HashMap<String, ArrayList<Animal>> animals) {
        System.out.println("\nMale Animals:");

        // Iterate through each list of animals in the HashMap
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                // Check if the animal's gender is male
                if (animal.getGender().toString().equalsIgnoreCase("MALE")) {
                    // Print the animal's name and type
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }
}
