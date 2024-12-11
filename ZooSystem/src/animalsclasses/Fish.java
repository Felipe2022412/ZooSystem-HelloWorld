/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalsclasses;

import Enums.BloodyType;
import Enums.Diet;
import Enums.Gender;
import zoosystem.Habitat;
import Enums.NaturalHabitatType;

/**
 *
 * @author Lecturer
 */
public class Fish extends Animal {

    public Fish(String type, String name, int age, double weight, NaturalHabitatType.HabitatTypes habitat, String breed, double size, Diet.DietTypes diet, Gender.GenderTypes gender, boolean neutered, String behaviour, boolean hungerStatus, boolean healthStatus, BloodyType.BloodyTypes bloodType) {
        super(type, name, age, weight, habitat, breed, size, diet, gender, neutered, behaviour, hungerStatus, healthStatus, bloodType);
    }


}
