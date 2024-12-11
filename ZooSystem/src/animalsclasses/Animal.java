package animalsclasses;

import Enums.NaturalHabitatType.HabitatTypes;
import Enums.Diet.DietTypes;
import Enums.Gender.GenderTypes;
import Enums.BloodyType.BloodyTypes;

public class Animal {

    // Attributes
    private String type;          // Type of animal (e.g., Mammal, Bird)
    private String name;          // Name of the animal
    private int age;              // Age of the animal
    private double weight;        // Weight of the animal
    private HabitatTypes habitat; // Habitat type (enum)
    private String breed;         // Breed or species
    private double size;          // Size of the animal
    private DietTypes diet;       // Diet (enum)
    private GenderTypes gender;   // Gender (enum)
    private boolean neutered;     // Whether the animal is neutered
    private String behaviour;     // Behavioural traits
    private boolean hungerStatus; // Whether the animal is hungry
    private boolean healthStatus; // Health status
    private BloodyTypes bloodType; // Blood type (enum)

    // Constructor
    public Animal(String type, String name, int age, double weight, HabitatTypes habitat, String breed, double size,
                  DietTypes diet, GenderTypes gender, boolean neutered, String behaviour, boolean hungerStatus,
                  boolean healthStatus, BloodyTypes bloodType) {
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

    // Getters and setters
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

    public DietTypes getDiet() {
        return diet;
    }

    public void setDiet(DietTypes diet) {
        this.diet = diet;
    }

    public GenderTypes getGender() {
        return gender;
    }

    public void setGender(GenderTypes gender) {
        this.gender = gender;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public BloodyTypes getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodyTypes bloodType) {
        this.bloodType = bloodType;
    }
}
