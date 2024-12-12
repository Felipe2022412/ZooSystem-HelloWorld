package zoomenufunctions;

import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;

public class ListFemaleAnimals {

    /*
     * Static method to list all female animals in the zoo.
     * Iterates through the HashMap and filters animals based on their gender.
     */
    public static void listFemaleAnimals(HashMap<String, ArrayList<Animal>> animals) {
        System.out.println("\nFemale Animals:");

        // Iterate through each list of animals in the HashMap
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                // Check if the animal's gender is female
                if (animal.getGender().toString().equalsIgnoreCase("FEMALE")) {
                    // Print the animal's name and type
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }
}
