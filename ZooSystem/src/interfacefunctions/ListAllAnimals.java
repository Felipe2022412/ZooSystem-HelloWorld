/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacefunctions;

import java.util.List;
import animalsclasses.Animal;

/**
 *
 * @author dougl
 */
public class ListAllAnimals {

    public static void listAllAnimals(List<Animal> animals) {

        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
        } else {
            System.out.println("\nAnimals in the Zoo:");
            for (Animal animal : animals) {
                System.out.println(animal.getName() + " (" + animal.getType() + ")");
            }
        }
    }
}
