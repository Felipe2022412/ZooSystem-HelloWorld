package zoosystem;

import Enums.NaturalHabitatType;
import Enums.BloodyType.BloodyTypes;
import Enums.Diet.DietTypes;
import Enums.Gender.GenderTypes;
import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.List;

public class ZooImp {
    public static void main(String[] args) {
        // Lista de animais
        List<Animal> animals = new ArrayList<>();

        // Instanciar os animais
        animals.add(new Animal("Mammal", "Lion", 12, 200.0, NaturalHabitatType.HabitatTypes.JUNGLE, "Panthera leo", 2.5, DietTypes.CARNIVORES, GenderTypes.MALE, false, "Aggressive", true, true, BloodyTypes.ENDOTHERMIC));
        animals.add(new Animal("Bird", "Eagle", 5, 9.0, NaturalHabitatType.HabitatTypes.FOREST, "Aquila chrysaetos", 0.8, DietTypes.CARNIVORES, GenderTypes.FEMALE, false, "Territorial", true, false, BloodyTypes.ENDOTHERMIC));
        animals.add(new Animal("Fish", "Baby Shark", 2, 3.0, NaturalHabitatType.HabitatTypes.OCEAN, "Carcharodon carcharias", 1.2, DietTypes.CARNIVORES, GenderTypes.MALE, false, "Curious", false, false, BloodyTypes.ECTOTERMIC));

        // Inicia o menu
        Menu menu = new Menu(animals);
        menu.showMenu();
    }
}
