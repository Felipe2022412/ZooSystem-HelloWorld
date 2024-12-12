package zoomenufunctions;

import animalsclasses.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Utility class to get and display a random animal from a HashMap.
 */
public class GetRandom {

    public static void getRandomAnimal(HashMap<String, ArrayList<Animal>> animals) {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
            return;
        }

        // Flatten the HashMap into a single list of animals
        List<Animal> allAnimals = new ArrayList<>();
        for (ArrayList<Animal> animalList : animals.values()) {
            allAnimals.addAll(animalList);
        }

        // Select a random animal
        Random random = new Random();
        int index = random.nextInt(allAnimals.size()); // Get a random index
        Animal randomAnimal = allAnimals.get(index);   // Retrieve the animal at the index

        // Display the animal's details
        System.out.println("\nRandom Animal:");
        System.out.println("-----------------------");
        System.out.println(randomAnimal.toStringAllInfos());
    }
}
