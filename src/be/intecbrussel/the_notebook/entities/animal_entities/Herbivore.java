package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.*;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {
    Set<Plant> plantDiet = new HashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        //focus here while making instances
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        if ((plant instanceof Tree)) {
            if (!((Tree) plant).getLeafType().equals(LeafType.NEEDLE)) {
                plantDiet.add(plant);
            }
        } else if (plant instanceof Bush) {
            if (!((Bush) plant).getLeafType().equals(LeafType.NEEDLE)) {
                plantDiet.add(plant);
            }
        } else if (plant instanceof Flower) {
            if (!((Flower) plant).getSmell().equals(Scent.SOUR)) {
                plantDiet.add(plant);
            }
        }
        if (!(plant instanceof Weed)) {
            plantDiet.add(plant);
        }
    }


    public void printDiet() {
        plantDiet.forEach(System.out::println);

    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", plantDiet=" + plantDiet +
                '}';
    }
}
