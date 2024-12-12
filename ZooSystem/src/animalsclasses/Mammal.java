
package animalsclasses;

import Enums.BloodyType;
import Enums.Diet;
import Enums.Gender;
import Enums.NaturalHabitatType;

// Mammal class
public class Mammal extends Animal {

    // Constructor for Mammal
    public Mammal(String type, String name, int age, double weight, NaturalHabitatType.HabitatTypes habitat, 
                  String breed, double size, Diet.DietTypes diet, Gender.GenderTypes gender, 
                  boolean neutered, String behaviour, boolean hungerStatus, boolean healthStatus, 
                  BloodyType.BloodyTypes bloodType) {
        // Call the parent class (Animal) constructor
        super(type, name, age, weight, habitat, breed, size, diet, gender, neutered, behaviour, hungerStatus, healthStatus, bloodType);
    }
}
