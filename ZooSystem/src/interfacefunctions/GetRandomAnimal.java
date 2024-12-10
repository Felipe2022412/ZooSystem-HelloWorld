/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacefunctions;

import java.util.List;
import java.util.Random;
import animalsclasses.Animal;
import animalsclasses.Bird;
import animalsclasses.Fish;
import animalsclasses.Mammal;

/**
 *
 * @author dougl
 */
public class GetRandomAnimal {
    
    //Single Responsibility Principle
    
    public static void getRandomAnimal(List<Animal> animals) {

        // Get a random index position
        // then use that random index position to retrieve an animal at that location
        Random random = new Random();
        // whatever number we get back we can use to get a random entry at that location
        int index = random.nextInt(animals.size()); // get the size of the list 
//           random number will be between 0 and list size 3

        Animal animal = animals.get(index);

        System.out.println("\nRandom Animal: ");
        System.out.println("-----------------------");

        // for each animals instance 
        // check the animals class
        if (animal instanceof Mammal) {
            // this means that we are iterating in the Mammal class list 
            // since we know this animal is an instance of mammal 
            // create a Mammal reference for that animal
            Mammal mammal = (Mammal) animal;
            System.out.println("Type: Mammal");
            System.out.println("Name: " + mammal.getName());
            System.out.println("Age: " + mammal.getAge());
            System.out.println("Weight: " + mammal.getWeight());
            System.out.println("Habitat: " + mammal.getHabitat());
        } else if (animal instanceof Fish) {
            Fish fish = (Fish) animal;
            System.out.println("Type: Fish");
            System.out.println("Name: " + fish.getName());
            System.out.println("Age: " + fish.getAge());
            System.out.println("Weight: " + fish.getWeight());
            System.out.println("Habitat: " + fish.getHabitat());

        } else if (animal instanceof Bird) {

            Bird bird = (Bird) animal;
            System.out.println("Type: Bird");
            System.out.println("Name: " + bird.getName());
            System.out.println("Age: " + bird.getAge());
            System.out.println("Weight: " + bird.getWeight());
            System.out.println("Habitat: " + bird.getHabitat());
        }
        System.out.println("-----------------------");

    }
    
    
    
    
}
