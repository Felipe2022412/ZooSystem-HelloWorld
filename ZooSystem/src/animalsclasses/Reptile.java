
package animalsclasses;

import Enums.BloodyType;
import Enums.Diet;
import Enums.Gender;
import Enums.NaturalHabitatType;

// Reptile class
public class Reptile extends Animal {

    // Constructor for Reptile
    public Reptile(String type, String name, int age, double weight, NaturalHabitatType.HabitatTypes habitat,
            String breed, double size, Diet.DietTypes diet, Gender.GenderTypes gender,
            boolean neutered, String behaviour, boolean hungerStatus, boolean healthStatus,
            BloodyType.BloodyTypes bloodType) {
        // Call the parent class (Animal) constructor
        super(type, name, age, weight, habitat, breed, size, diet, gender, neutered, behaviour, hungerStatus, healthStatus, bloodType);
    }
}
