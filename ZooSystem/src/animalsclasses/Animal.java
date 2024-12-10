/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalsclasses;

import zoosystem.HabitatType.HabitatTypes;

/**
 *
 * @author Lecturer
 */
public class Animal {

    // Create some attributes 
    private String type;//alterei
    private String name;
    private int age;
    private double weight;
    private HabitatTypes habitat;
    private String breed;
    private double size;
    private String diet;
    private String gender;
    private boolean neutered;
    private String behaviour;
    private boolean hungerStatus;
    private boolean healthStatus;
    private String bloodType;

//    / The constructor is our point of reference when communicating with this class
    public Animal(String type, String name, int age, double weight, HabitatTypes habitat, String breed, double size, String diet, String gender, boolean neutered, String behaviour, boolean hungerStatus, boolean healthStatus, String bloodType) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
        this.breed = breed;
        this.size = size;
        this.diet = diet;
        this.gender = gender;
        this.neutered = neutered;
        this.behaviour = behaviour;
        this.hungerStatus = hungerStatus;
        this.healthStatus = healthStatus;
        this.bloodType = bloodType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public boolean isHungerStatus() {
        return hungerStatus;
    }

    public void setHungerStatus(boolean hungerStatus) {
        this.hungerStatus = hungerStatus;
    }

    public boolean isHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(boolean healthStatus) {
        this.healthStatus = healthStatus;
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

    public HabitatTypes getHabitat() {
        return habitat;
    }

    public void setHabitat(HabitatTypes habitat) {
        this.habitat = habitat;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

}
