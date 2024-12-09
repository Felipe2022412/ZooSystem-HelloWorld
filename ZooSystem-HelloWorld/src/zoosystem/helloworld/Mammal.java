/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosystem.helloworld;


/**
 *
 * @author Lecturer
 */
public class Mammal extends Animal{
    
    // Once the Mammal extends the animal class
    // it will inherent the animal class attributes
    // we can use to create new animal types 
    // with the parent class attributes
    
    // Create a Dog name: Flix,    2,         12.5,         Home 
    public Mammal(String name, int age, double weight, Habitat habitat,  String behaviour, boolean hunger, boolean healthy){
            
            // we want to send this back to the parent 
            super(name, age, weight, habitat,  behaviour, hunger, healthy);
    }

}
