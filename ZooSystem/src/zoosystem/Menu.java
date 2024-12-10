/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosystem;

import animalsclasses.Animal;
import interfacefunctions.GetRandomAnimal;
import interfacefunctions.ListAllAnimals;
import interfacefunctions.ListAllTypes;
import java.util.List;

/**
 *
 * @author dougl
 */
public class Menu implements Zoo{

// list all animals 
    @Override
    public void listAllAnimals(List<Animal> animals) {

        ListAllAnimals.listAllAnimals(animals);

    }

    @Override
    public void listAllTypes(List<Animal> animals) {

        ListAllTypes.listAllTypes(animals);

    }

    @Override
//  Animal(String name, int age, double weight, String habitat)
    public void addAnimal(Animal animal) {

    //IMPLEMENTAR
    } // requires we pass in animal information

    @Override
    public void getRandom(List<Animal> animals) {

        GetRandomAnimal.getRandomAnimal(animals);

    }

    @Override
    public void listSickAnimals(List<Animal> animals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listMaleAnimals(List<Animal> animals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listFemaleAnimals(List<Animal> animals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listNeuteredAnimals(List<Animal> animals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listHerbivoreAnimals(List<Animal> animals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listOmnivoreAnimals(List<Animal> animals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listCarnivoreAnimals(List<Animal> animals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listHungryAnimals(List<Animal> animals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
