package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ForestNotebook {
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new LinkedList<>();
    private List<Plant> plants = new LinkedList<>();

    public ForestNotebook() {
        this.animalCount = 0;
        this.plantCount = 0;
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        plantCount = plants.size();
        return plantCount;
    }

    public int getAnimalCount() {
        animalCount = animals.size();
        return animalCount;
    }

    public void addAnimal(Animal... animalInputList) {
        for (Animal animal : animalInputList) {
            if (!animals.contains(animal)) {
                animals.add(animal);
                if (animal instanceof Carnivore) {
                    carnivores.add((Carnivore) animal);
                } else if (animal instanceof Herbivore) {
                    herbivores.add((Herbivore) animal);
                } else if (animal instanceof Omnivore) {
                    omnivores.add((Omnivore) animal);
                }
            }
        }

    }

    public void addPlant(Plant... plantsInputList) {
        for (Plant plant : plantsInputList) {
            if (!plants.contains(plant)) {
                plants.add(plant);
            }

        }

    }

    public void printNotebook() {
        animals.forEach(System.out::println);
        plants.forEach(System.out::println);

    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));

    }

    public void sortPlantByName() {
        plants.sort(Comparator.comparing(Plant::getName));
    }
}
