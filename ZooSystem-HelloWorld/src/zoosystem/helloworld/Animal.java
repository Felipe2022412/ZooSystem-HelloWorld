/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

import zoosystem.helloworld.Habitat;

/**
 *
 * @author Lecturer
 */
public class Animal {
    
    // Create some attributes 
    
    private String name;
    private int age;
    private double weight;
    public Habitat habitat;
    private String behaviour;
    private boolean hunger;
    private boolean healthy;
   
    
    
//    / The constructor is our point of reference when communicating with this class
   

    public Animal(String name, int age, double weight, Habitat habitat, String behaviour, boolean hunger, boolean healthy) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
        this.behaviour = behaviour;
        this.hunger = hunger;
        this.healthy = healthy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

   

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public boolean isHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
