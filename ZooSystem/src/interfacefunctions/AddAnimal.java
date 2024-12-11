package interfacefunctions;

import animalsclasses.Animal;
import java.util.List;
import java.util.Scanner;
import Enums.NaturalHabitatType.HabitatTypes;
import Enums.Diet.DietTypes;
import Enums.Gender.GenderTypes;
import Enums.BloodyType.BloodyTypes;

public class AddAnimal {

    public static void addAnimal(List<Animal> animals) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Animal Type (e.g., Mammal, Bird, Fish or a new one):");
        String type = scanner.nextLine();

        System.out.println("Enter the Animal Name:");
        String name = scanner.nextLine();

        System.out.println("Enter the Age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the Weight:");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        // Listar e selecionar o Habitat
        System.out.println("Select the Habitat from the options below:");
        HabitatTypes[] habitats = HabitatTypes.values();
        for (int i = 0; i < habitats.length; i++) {
            System.out.println((i + 1) + ". " + habitats[i]);
        }
        System.out.print("Enter the number corresponding to the habitat: ");
        int habitatOption = scanner.nextInt();
        scanner.nextLine();
        HabitatTypes habitat = (habitatOption >= 1 && habitatOption <= habitats.length) ? habitats[habitatOption - 1] : HabitatTypes.FOREST;

        System.out.println("Enter the Breed:");
        String breed = scanner.nextLine();

        System.out.println("Enter the Size:");
        double size = scanner.nextDouble();
        scanner.nextLine();

        // Listar e selecionar a Dieta
        System.out.println("Select the Diet from the options below:");
        DietTypes[] diets = DietTypes.values();
        for (int i = 0; i < diets.length; i++) {
            System.out.println((i + 1) + ". " + diets[i]);
        }
        System.out.print("Enter the number corresponding to the diet: ");
        int dietOption = scanner.nextInt();
        scanner.nextLine();
        DietTypes diet = (dietOption >= 1 && dietOption <= diets.length) ? diets[dietOption - 1] : DietTypes.OMNIVORES;

        // Listar e selecionar o Gênero
        System.out.println("Select the Gender from the options below:");
        GenderTypes[] genders = GenderTypes.values();
        for (int i = 0; i < genders.length; i++) {
            System.out.println((i + 1) + ". " + genders[i]);
        }
        System.out.print("Enter the number corresponding to the gender: ");
        int genderOption = scanner.nextInt();
        scanner.nextLine();
        GenderTypes gender = (genderOption >= 1 && genderOption <= genders.length) ? genders[genderOption - 1] : GenderTypes.MALE;

        // Selecionar se está Neutered
        System.out.println("Is the Animal Neutered?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Enter the number: ");
        boolean neutered = scanner.nextInt() == 1;

        // Selecionar o Comportamento
        System.out.println("Enter the Behaviour:");
        scanner.nextLine(); // Consome quebra de linha
        String behaviour = scanner.nextLine();

        // Selecionar se está com fome
        System.out.println("Is the Animal Hungry?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Enter the number: ");
        boolean hungerStatus = scanner.nextInt() == 1;

        // Selecionar o status de saúde
        System.out.println("Is the Animal Healthy?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Enter the number: ");
        boolean healthStatus = scanner.nextInt() == 1;

        // Listar e selecionar o Tipo Sanguíneo
        System.out.println("Select the Blood Type from the options below:");
        BloodyTypes[] bloodTypes = BloodyTypes.values();
        for (int i = 0; i < bloodTypes.length; i++) {
            System.out.println((i + 1) + ". " + bloodTypes[i]);
        }
        System.out.print("Enter the number corresponding to the blood type: ");
        int bloodTypeOption = scanner.nextInt();
        scanner.nextLine();
        BloodyTypes bloodType = (bloodTypeOption >= 1 && bloodTypeOption <= bloodTypes.length) ? bloodTypes[bloodTypeOption - 1] : BloodyTypes.ENDOTHERMIC;

        // Cria o novo animal
        Animal newAnimal = new Animal(type, name, age, weight, habitat, breed, size, diet, gender, neutered, behaviour, hungerStatus, healthStatus, bloodType);
        animals.add(newAnimal);

        System.out.println("Animal has been added successfully!");
    }
}
