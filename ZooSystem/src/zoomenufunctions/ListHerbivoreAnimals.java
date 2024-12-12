/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoomenufunctions;

import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author dougl
 */
public class ListHerbivoreAnimals {
    
        public static void listHerbivoreAnimals(HashMap<String, ArrayList<Animal>> animals) {
        System.out.println("\nHerbivore Animals:");
        for (ArrayList<Animal> animalList : animals.values()) {
            for (Animal animal : animalList) {
                if (animal.getDiet().toString().equalsIgnoreCase("HERBIVORES")) {
                    System.out.println(animal.getName() + " (" + animal.getType() + ")");
                }
            }
        }
    }
    
}
