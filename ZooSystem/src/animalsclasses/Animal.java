package animalsclasses;

import Enums.NaturalHabitatType.HabitatTypes;
import Enums.Diet.DietTypes;
import Enums.Gender.GenderTypes;
import Enums.BloodyType.BloodyTypes;

/**
 * Represents a general animal with various attributes such as type, habitat, diet, etc.
 */
public class Animal {

    // Attributes
    private String type;          // Type/category of the animal (e.g., Mammal, Bird)
    private String name;          // Name of the animal
    private int age;              // Age of the animal in years
    private double weight;        // Weight of the animal in kilograms
    private HabitatTypes habitat; // Habitat type (e.g., Jungle, Ocean)
    private String breed;         // Breed or species of the animal
    private double size;          // Size (e.g., height or length in meters)
    private DietTypes diet;       // Diet type (e.g., Herbivore, Carnivore)
    private GenderTypes gender;   // Gender of the animal (e.g., Male, Female)
    private boolean neutered;     // Whether the animal is neutered
    private String behaviour;     // Description of the animal's behavior
    private boolean hungerStatus; // Whether the animal is hungry
    private boolean healthStatus; // Whether the animal is healthy
    private BloodyTypes bloodType; // Blood type (e.g., Endothermic, Ectothermic)

    /**
     * Constructor to initialize all attributes of the animal.
     * 
     * @param type          Type/category of the animal
     * @param name          Name of the animal
     * @param age           Age of the animal in years
     * @param weight        Weight of the animal in kilograms
     * @param habitat       Habitat type (enum)
     * @param breed         Breed or species of the animal
     * @param size          Size of the animal (in meters)
     * @param diet          Diet type (enum)
     * @param gender        Gender of the animal (enum)
     * @param neutered      Whether the animal is neutered
     * @param behaviour     Behavioral traits of the animal
     * @param hungerStatus  Whether the animal is hungry
     * @param healthStatus  Whether the animal is healthy
     * @param bloodType     Blood type (enum)
     */
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

    // Getters and Setters
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

    /**
     * Provides a summary of the animal's main details.
     * 
     * @return A formatted string with the animal's main information.
     */
    public String toStringMainInfos() {
        return String.format(
                "Animal Details:\n"
                        + "-----------------\n"
                        + "Type: %s\n"
                        + "Name: %s\n"
                        + "Age: %d years\n"
                        + "Weight: %.2f kg\n"
                        + "Habitat: %s\n"
                        + "Breed: %s\n"
                        + "Size: %.2f m\n"
                        + "Diet: %s\n"
                        + "Gender: %s\n"
                        + "Neutered: %s",
                type, name, age, weight, habitat, breed, size, diet, gender, neutered ? "Yes" : "No"
        );
    }

    /**
     * Provides a detailed description of all the animal's attributes.
     * 
     * @return A formatted string with the animal's full information.
     */
    public String toStringAllInfos() {
        return String.format(
                "Animal Full Details:\n"
                        + "---------------------\n"
                        + "Type: %s\n"
                        + "Name: %s\n"
                        + "Age: %d years\n"
                        + "Weight: %.2f kg\n"
                        + "Habitat: %s\n"
                        + "Breed: %s\n"
                        + "Size: %.2f m\n"
                        + "Diet: %s\n"
                        + "Gender: %s\n"
                        + "Neutered: %s\n"
                        + "Behaviour: %s\n"
                        + "Hungry: %s\n"
                        + "Healthy: %s\n"
                        + "Blood Type: %s",
                type, name, age, weight, habitat, breed, size, diet, gender,
                neutered ? "Yes" : "No", behaviour, hungerStatus ? "Yes" : "No",
                healthStatus ? "Yes" : "No", bloodType
        );
    }
}
