package zoosystem;

import Enums.NaturalHabitatType;
import animalsclasses.Animal;
import java.util.ArrayList;
import java.util.List;

public class Habitat {

    private NaturalHabitatType.HabitatTypes habitatType; // Usar o enum diretamente
    private List<Animal> animalList; // Lista de animais no habitat

    public Habitat(NaturalHabitatType.HabitatTypes habitatType) {
        this.habitatType = habitatType;
        this.animalList = new ArrayList<>(); // Inicializa a lista de animais
    }

    // Obter todos os animais no habitat
    public List<Animal> getAnimals() {
        return animalList;
    }

    // Adicionar um animal ao habitat
    public void addAnimal(Animal animal) {
        animalList.add(animal);
        System.out.println(animal.getName() + " adicionado ao habitat " + habitatType + ".");
    }

    // Remover um animal do habitat
    public void removeAnimal(Animal animal) {
        if (animalList.remove(animal)) {
            System.out.println(animal.getName() + " removido do habitat " + habitatType + ".");
        } else {
            System.out.println(animal.getName() + " não encontrado no habitat " + habitatType + ".");
        }
    }

    // Obter tipo de habitat
    public NaturalHabitatType.HabitatTypes getHabitatType() {
        return habitatType;
    }

    // Limpar o habitat
    public void cleanHabitat() {
        System.out.println("Limpando o habitat " + habitatType + "...");
    }
}
