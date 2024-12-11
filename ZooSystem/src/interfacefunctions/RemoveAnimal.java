package interfacefunctions;

import animalsclasses.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Utility class for removing an animal from the zoo.
 */
public class RemoveAnimal {

    public static void removeAnimal(HashMap<String, ArrayList<Animal>> animals) {
        Scanner scanner = new Scanner(System.in);

        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo to remove.");
            return;
        }

        // Store mappings during the first iteration
        System.out.println("\nSelect an Animal to Remove:");
        int count = 1;
        HashMap<Integer, Animal> animalMap = new HashMap<>();
        HashMap<Integer, String> typeMap = new HashMap<>();

        for (String type : animals.keySet()) {
            ArrayList<Animal> animalList = animals.get(type);
            for (int i = 0; i < animalList.size(); i++) {
                Animal animal = animalList.get(i);
                System.out.println(count + ". " + animal.getName() + " (" + type + ")");
                animalMap.put(count, animal);      // Map the count to the animal
                typeMap.put(count, type);         // Map the count to the type
                count++;
            }
        }

        // Ask user to select an animal
        System.out.print("Enter the number corresponding to the animal: ");
        int choice = scanner.nextInt();

        // Retrieve and remove the selected animal
        if (animalMap.containsKey(choice)) {
            Animal selectedAnimal = animalMap.get(choice);
            String selectedType = typeMap.get(choice);

            // Remove the animal from the appropriate type list
            animals.get(selectedType).remove(selectedAnimal);
            System.out.println("Animal removed successfully: " + selectedAnimal.getName());

            // If no animals remain for the type, remove the type from the HashMap
            if (animals.get(selectedType).isEmpty()) {
                animals.remove(selectedType);
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
