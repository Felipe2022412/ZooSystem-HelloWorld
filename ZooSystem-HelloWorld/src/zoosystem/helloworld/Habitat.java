/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosystem.helloworld;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felip
 */
public class Habitat extends HabitatType{
    
   
 
    private final List<Animal> animalList; // Listing of animals 
    public final HabitatType habitatType; // Type of habitat

     // creating contructors for animalList and habitatType
    public Habitat(HabitatType habitatType) {
        this.animalList = new ArrayList<>();
        this.habitatType = habitatType;
    }

    //  to get all the  animals in the habitat
    public List<Animal> getAnimals() {
        return animalList;
    }

    // so i can add an animal to the habitat
    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    // so i can remove an animal from the habitat
    public void removeAnimal(Animal animal) {
        animalList.remove(animal);
    }

    // to be able to move an animalfrom an habitat to another
    public void moveAnimal(Animal animal, Habitat destinationHabitat) {
        if (animalList.contains(animal)) {
            this.removeAnimal(animal);
            destinationHabitat.addAnimal(animal);
        }
    }

    // to find out where the animal lives
    public HabitatType getHabitatType() {
        return habitatType;
    }

    //to get their habitat cleaned 
    public void cleanHabitat() {
        System.out.println("The " + habitatType + " is being cleaned");
    }
    
}

    
    
