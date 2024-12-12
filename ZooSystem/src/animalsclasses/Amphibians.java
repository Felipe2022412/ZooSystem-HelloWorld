/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalsclasses;

import Enums.BloodyType;
import Enums.Diet;
import Enums.Gender;
import Enums.NaturalHabitatType;

/**
 *
 * @author dougl
 */
public class Amphibians extends Animal {

    public Amphibians(String type, String name, int age, double weight, NaturalHabitatType.HabitatTypes habitat, String breed, double size, Diet.DietTypes diet, Gender.GenderTypes gender, boolean neutered, String behaviour, boolean hungerStatus, boolean healthStatus, BloodyType.BloodyTypes bloodType) {
        super(type, name, age, weight, habitat, breed, size, diet, gender, neutered, behaviour, hungerStatus, healthStatus, bloodType);
    }

}