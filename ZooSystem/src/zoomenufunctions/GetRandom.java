package zoomenufunctions;

import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class GetRandom {

    /*
     * Static method to select and display a random animal from the provided HashMap.
     * If the zoo has no animals, it informs the user.
     */
    public static void getRandomAnimal(HashMap<String, ArrayList<Animal>> animals) {
        // Check if the HashMap is empty
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
            return; // Exit if there are no animals
        }

        // Combine all animal lists from the HashMap into a single list
        List<Animal> allAnimals = new ArrayList<>();
        for (ArrayList<Animal> animalList : animals.values()) {
            allAnimals.addAll(animalList); // Add each list of animals to the combined list
        }

        // Select a random animal from the combined list
        Random random = new Random();
        int index = random.nextInt(allAnimals.size()); // Generate a random index
        Animal randomAnimal = allAnimals.get(index);   // Retrieve the animal at the random index

        // Display the details of the selected random animal
        System.out.println("\nRandom Animal:");
        System.out.println("-----------------------");
        System.out.println(randomAnimal.toStringAllInfos());
    }
}
