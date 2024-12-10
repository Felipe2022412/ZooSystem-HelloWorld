/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosystem;

import animalsclasses.Animal;
import java.util.List;

/**
 *
 * @author Lecturer
 */
public interface Zoo {

        enum MenuOptions{
        
        // contain a couple of options 
            
            LIST_ANIMALS, // 0 +1
            LIST_TYPES, // 1 +1
            ADD_ANIMAL, // 2 +1
            RANDOM_ANIMAL,// 3 + 1
            MORE_OPTIONS, // 4 + 1
            EXIT // 5+1

        }
   
        enum SubMenuOptions {
        
         LIST_SICK_ANIMALS,
         LIST_MALE_ANIMALS,
         LIST_FEMALE_ANIMALS,
         LIST_NEUTERED_ANIMALS,
         LIST_HERBIVORE_ANIMALS,
         LIST_OMNIVORE_ANIMALS,
         LIST_CARNIVORE_ANIMALS,
         LIST_HUNGRY_ANIMALS,
         
        }
        // implementing interfaces requires 
        // that we implement all of the abstarct methods
        
        void listAllAnimals(List<Animal> animals);
        
        void listAllTypes(List<Animal> animals);
        
        void addAnimal(Animal animal); // requires we pas in animal information
        
        void getRandom(List<Animal> animals);
        
        void listSickAnimals(List<Animal> animals);
        
        void listMaleAnimals(List<Animal> animals);
        
        void listFemaleAnimals(List<Animal> animals);
        
        void listNeuteredAnimals(List<Animal> animals);
        
        void listHerbivoreAnimals(List<Animal> animals);
        
        void listOmnivoreAnimals(List<Animal> animals);
        
        void listCarnivoreAnimals(List<Animal> animals); 
        
        void listHungryAnimals(List<Animal> animals);
}