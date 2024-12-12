package zoosystem;

import Enums.NaturalHabitatType;
import Enums.BloodyType.BloodyTypes;
import Enums.Diet.DietTypes;
import Enums.Gender.GenderTypes;
import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;

public class ZooImp {
    public static void main(String[] args) {
        // HashMap to store animals by type
        // HashMap to store animals categorized by their type
        HashMap<String, ArrayList<Animal>> zooAnimals = new HashMap<>();

        // Add animals directly to the HashMap
        
        // Mammals
        zooAnimals.putIfAbsent("Mammal", new ArrayList<>());
        zooAnimals.get("Mammal").add(new Animal("Mammal", "Lion", 12, 200.0,
                NaturalHabitatType.HabitatTypes.JUNGLE, "Panthera leo", 2.5,
                DietTypes.CARNIVORES, GenderTypes.MALE, false, "Aggressive",
                true, true, BloodyTypes.ENDOTHERMIC));

        // Birds
        zooAnimals.putIfAbsent("Bird", new ArrayList<>());
        zooAnimals.get("Bird").add(new Animal("Bird", "Eagle", 5, 9.0,
                NaturalHabitatType.HabitatTypes.FOREST, "Aquila chrysaetos", 0.8,
                DietTypes.CARNIVORES, GenderTypes.FEMALE, false, "Territorial",
                true, false, BloodyTypes.ENDOTHERMIC));

        // Fish
        zooAnimals.putIfAbsent("Fish", new ArrayList<>());
        zooAnimals.get("Fish").add(new Animal("Fish", "Baby Shark", 2, 3.0,
                NaturalHabitatType.HabitatTypes.OCEAN, "Carcharodon carcharias", 1.2,
                DietTypes.CARNIVORES, GenderTypes.MALE, false, "Curious",
                false, false, BloodyTypes.ECTOTERMIC));

        // Initialize the menu with the populated HashMap
        Menu menu = new Menu(zooAnimals);
        menu.showMenu();
    }
}
