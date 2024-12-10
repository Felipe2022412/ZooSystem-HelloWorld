/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosystem;

import animalsclasses.Fish;
import animalsclasses.Bird;
import animalsclasses.Animal;
import animalsclasses.Mammal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import interfacefunctions.*;
import zoosystem.HabitatType.HabitatTypes;

/**
 *
 * @author Lecturer
 */
public class ZooImp implements Zoo {

    // interface implementation 
    // Create a ZooImp constructor 
    // Pick a collection type
    private List<Animal> animals;

    public ZooImp() {

        //I didnt figrout how to implements the enums here but I can use them to display when the user create an new animal it will be displayed to the user, because I shuld create an method to convert 
        Habitat savannah = new Habitat("savannah");
        Habitat jungle = new Habitat("jungle");
        Habitat artctic = new Habitat("artctic");
        Habitat forest = new Habitat("forest");
        Habitat coast = new Habitat("Coast");
        Habitat desert = new Habitat("desert");
        Habitat ocean = new Habitat("ocean");

        this.animals = new ArrayList<>();
        // Populate the collection with initial records
        animals.add(new Animal("Mammal", "Lion", 12, 200.0, HabitatTypes.JUNGLE, "Panthera leo", 2.5, "Carnivore", "Male", false, "Aggressive", true, true, "O+"));
        animals.add(new Animal("Bird", "Eagle", 5, 9.0, forest, "Aquila chrysaetos", 0.8, "Carnivore", "Female", false, "Territorial", true, false, "B+"));
        animals.add(new Animal("Fish", "Baby Shark", 2, 3.0, ocean, "Carcharodon carcharias", 1.2, "Carnivore", "Male", false, "Curious", false, false, "Unknown"));

    }

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
//                        Animal(String name, int age, double weight, String habitat)
    public void addAnimal(Animal animal) {

        //IMPLEMENTAR
    } // requires we pass in animal information

    @Override
    public void getRandom() {

        GetRandomAnimal.getRandomAnimal(animals);

    }

    public static Boolean isNumeric(String str) {
        // the input coming from the users mammalDetails contains
//             mammalDetails = ["Lion", "12", "120", "Jungle"]
//          We need to validate the string number values to be numeric 
//                          -?  ?  "2" "2.2" are true
        return str.matches("-?\\d+(\\.\\d+)?");
//             return true or false if the string is a numeric value == "2"
    }

    public static void main(String[] args) {

        // construct a zooImp constructor reference 
        ZooImp zoo = new ZooImp();

        Scanner scanner = new Scanner(System.in);
        // create an interface reference to access 
        // the enums to use as our set of options and test against userinput
        // the enums are in the interface Zoo
        MenuOptions selectOption = null;

        do {

            System.out.println("Select an Option:\n");
            System.out.println("1. List All Animals");
            System.out.println("2. List Animal Types");
            System.out.println("3. Add Animal");
            System.out.println("4. Random Animal");
            System.out.println("5. Exit");

            // capture user selection as a number
            int option = scanner.nextInt(); // this is the user choice == 3

            // validate user choice 
            if (option < 1 || option > MenuOptions.values().length) {
                // as long as the value is not less than the choices of enums or more 
                System.out.println("Please make a valid selection from the menu ranges");
            } else {
//        the userinput will not match the enums 
//        because ethe enums are 0 indexed
//        our menu starts at 1
                selectOption = MenuOptions.values()[option - 1]; // 3 - 1 = [0] index enum
                // this will match the user input with the enum index

                switch (selectOption) {

                    case LIST_ANIMALS: // instead of using a number for cases we use enums 
                        zoo.listAllAnimals();
                        break;
                    case LIST_TYPES: // 1
                        zoo.listAllTypes();
                        break;
                    case ADD_ANIMAL:

//                We need to know what type of Animal instance the user wants to add
//                We have Mammal Bird or Fish 3 instances of 3 classes
                        System.out.println("Please select the Animal type to add:\n(1. Mammal\n2. Fish\n3. Bird) ");
//                Capture the user input 
                        int type = scanner.nextInt();
//                Create a switch case on the user type of animal
                        switch (type) {
                            // if 1. We add a Mammal               
                            case 1:
                                System.out.println("Please provide the Mammal (Name, Age, Weight, Habitat)");
//                        Take the user input and store it in a string array []
//                        The data structure is a CSV comma seperated 
//                        userinput = "Lion, 12, 120, Jungle"
//                        Specify the delim using split() == ,
//                        make it a string array = ["Lion", "12", "120", "Jungle"]
//                                                   1        2     3        4
//                        String[] mammalDetails = ["Lion", "12", "120", "Jungle"]
                                scanner.nextLine();
                                String[] mammalDetails = scanner.nextLine().split(",");
//                        System.out.println("printing split" + mammalDetails);
                                if (mammalDetails.length == 7) {//chnage to handle the new imputs to create the animal
//                            System.out.println("printing split" + mammalDetails);
//                            do this because we have 4 fields 
//                            mammalDetails = ["Lion", "12", "120", "Jungle"]
                                    //              Animal(String name, int age, double weight, String habitat)                
                                    //              Mammal [name, age, weight, habitat] 
                                    //              zoo.addAnimal(Animal animal); 
                                    // create a method to validate numeric entries 
                                    // Validate that the string in the age and weight fields are numeric
//                            mammalDetails = [" Lion ", " 12", " 120 ", " Jungle","sound","true","false"]
//                                              0,      1,      2,      3
//                                    System.out.println("Is Numeric check");
                                    if (isNumeric(mammalDetails[1].trim()) && isNumeric(mammalDetails[2].trim())) {
//                                Do this insert the data into the matching class instance
//                                            System.out.println("printing split" + mammalDetails);
                                        zoo.addAnimal(new Mammal(
                                                mammalDetails[0].trim(), // Name 
                                                Integer.parseInt(mammalDetails[1].trim()), // Age
                                                Double.parseDouble(mammalDetails[2].trim()), // Weight
                                                mammalDetails[3].trim(), // Habitat
                                                mammalDetails[4].trim(),//sound
                                                Boolean.parseBoolean(mammalDetails[5].toLowerCase()),//hunger
                                                Boolean.parseBoolean(mammalDetails[6].toLowerCase())//healthStatus
                                        ));
                                    } else {
//                                    If the input is mismatching the type of value 
//                                      ValueError
                                        System.out.println("Invalid input for Age or Weight!\nMake sure both are numeric i.e (2 or 2.2)");
                                    }
                                } else {
                                    System.out.println("Invalid Input!");
                                    System.out.println("Please make sure to use a comma seperated format");
                                    System.out.println("Name, Age, Weight, Habitat");
                                }
                                break;
                            case 2:
                                System.out.println("Please provide the Fish (Name, Age, Weight, Habitat)");
//                        Take the user input and store it in a string array []
//                        The data structure is a CSV comma seperated 
//                        userinput = "Lion, 12, 120, Jungle"
//                        Specify the delim using split() == ,
//                        make it a string array = ["Lion", "12", "120", "Jungle"]
//                                                   1        2     3        4
//                        String[] mammalDetails = ["Lion", "12", "120", "Jungle"]
                                scanner.nextLine();
                                String[] fishDetails = scanner.nextLine().split(",");
//                        System.out.println("printing split" + mammalDetails);
                                if (fishDetails.length == 4) {
//                            System.out.println("printing split" + mammalDetails);
//                            do this because we have 4 fields 
//                            mammalDetails = ["Lion", "12", "120", "Jungle"]
                                    //              Animal(String name, int age, double weight, String habitat)                
                                    //              Mammal [name, age, weight, habitat] 
                                    //              zoo.addAnimal(Animal animal); 
                                    // create a method to validate numeric entries 
                                    // Validate that the string in the age and weight fields are numeric
//                            mammalDetails = [" Lion ", " 12", " 120 ", " Jungle"]
//                                              0,      1,      2,      3
//                                    System.out.println("Is Numeric check");
                                    if (isNumeric(fishDetails[1].trim()) && isNumeric(fishDetails[2].trim())) {
//                                Do this insert the data into the matching class instance
//                                            System.out.println("printing split" + mammalDetails);
                                        zoo.addAnimal(new Fish(
                                                fishDetails[0].trim(), // Name 
                                                Integer.parseInt(fishDetails[1].trim()), // Age
                                                Double.parseDouble(fishDetails[2].trim()), // Weight
                                                fishDetails[3],// Habitat
                                                fishDetails[4].trim(),//sound
                                                Boolean.parseBoolean(fishDetails[5].toLowerCase().trim()),//hunger
                                                Boolean.parseBoolean(fishDetails[6].toLowerCase().trim())//healthStatus
                                        ));
                                    } else {
//                                    If the input is mismatching the type of value 
//                                      ValueError
                                        System.out.println("Invalid input for Age or Weight!\nMake sure both are numeric i.e (2 or 2.2)");
                                    }
                                } else {
                                    System.out.println("Invalid Input!");
                                    System.out.println("Please make sure to use a comma seperated format");
                                    System.out.println("Name, Age, Weight, Habitat");
                                }
                                break;
                            case 3:
                                System.out.println("Please provide the Bird (Name, Age, Weight, Habitat)");
//                        Take the user input and store it in a string array []
//                        The data structure is a CSV comma seperated 
//                        userinput = "Lion, 12, 120, Jungle"
//                        Specify the delim using split() == ,
//                        make it a string array = ["Lion", "12", "120", "Jungle"]
//                                                   1        2     3        4
//                        String[] mammalDetails = ["Lion", "12", "120", "Jungle"]
                                scanner.nextLine();
                                String[] birdDetails = scanner.nextLine().split(",");
//                        System.out.println("printing split" + mammalDetails);
                                if (birdDetails.length == 4) {
//                            System.out.println("printing split" + mammalDetails);
//                            do this because we have 4 fields 
//                            mammalDetails = ["Lion", "12", "120", "Jungle"]
                                    //              Animal(String name, int age, double weight, String habitat)                
                                    //              Mammal [name, age, weight, habitat] 
                                    //              zoo.addAnimal(Animal animal); 
                                    // create a method to validate numeric entries 
                                    // Validate that the string in the age and weight fields are numeric
//                            mammalDetails = [" Lion ", " 12", " 120 ", " Jungle"]
//                                              0,      1,      2,      3
//                                    System.out.println("Is Numeric check");
                                    if (isNumeric(birdDetails[1].trim()) && isNumeric(birdDetails[2].trim())) {
//                                Do this insert the data into the matching class instance
//                                            System.out.println("printing split" + mammalDetails);
                                        zoo.addAnimal(new Bird(
                                                birdDetails[0].trim(), // Name 
                                                Integer.parseInt(birdDetails[1].trim()), // Age
                                                Double.parseDouble(birdDetails[2].trim()), // Weight
                                                birdDetails[3].trim(), // Habitat
                                                birdDetails[4],//sound
                                                Boolean.parseBoolean(birdDetails[5].toLowerCase().trim()),
                                                Boolean.parseBoolean(birdDetails[6].toLowerCase().trim())//healthStatus
                                        ));
                                    } else {
//                                    If the input is mismatching the type of value 
//                                      ValueError
                                        System.out.println("Invalid input for Age or Weight!\nMake sure both are numeric i.e (2 or 2.2)");
                                    }
                                } else {
                                    System.out.println("Invalid Input!");
                                    System.out.println("Please make sure to use a comma seperated format");
                                    System.out.println("Name, Age, Weight, Habitat");
                                }
                                break;
                            default:
                                System.out.println("Invalid selection from default");
                        }
                        break;
                    case RANDOM_ANIMAL: // 2
                        zoo.getRandom();
                        break;
                    case EXIT: // 3
                        System.out.println("Exiting program..");
                        break;
                    default:
                        System.out.println("Please try again, make sure your selection is a number!");
                }
            }
        } while (selectOption != MenuOptions.EXIT);
    }

}
