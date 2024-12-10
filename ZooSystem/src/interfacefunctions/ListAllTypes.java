/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacefunctions;

import java.util.ArrayList;
import java.util.List;
import animalsclasses.Animal;
import animalsclasses.Bird;
import animalsclasses.Fish;
import animalsclasses.Mammal;

/**
 *
 * @author dougl
 */
public class ListAllTypes {
    
    public static void listAllTypes(List<Animal> animals){
    
    
            // List all animal types 
        // by counting how many of each type we have 
        // we need to construct seperate collection spaces for each type
        // then we need to populate each of the 
        // collections according to their types of animals
        // we need to return the sizes of each of these collections 
        // change this so you could use HashMaps
        List<Mammal> mammals = new ArrayList<>();
        List<Bird> birds = new ArrayList<>();
        List<Fish> fish = new ArrayList<>();

        // iterate and populate 
        for (Animal animal : animals) {

            if (animal instanceof Mammal) {
                mammals.add((Mammal) animal);
            } else if (animal instanceof Fish) {
                fish.add((Fish) animal);
            } else if (animal instanceof Bird) {
                birds.add((Bird) animal);
            }
        }

        System.out.println("\nType of Animals: ");
        System.out.println("--------------------");
        System.out.println("Mammals: " + mammals.size());
        System.out.println("Fish: " + fish.size());
        System.out.println("Bird: " + birds.size());
        System.out.println("--------------------\n");
    }
    
    
}
