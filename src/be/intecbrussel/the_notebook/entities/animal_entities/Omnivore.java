package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.*;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {
    Set<Plant> plantDiet = new HashSet<>();
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
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
    }


    @Override
    public String toString() {
        return "Omnivore{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                '}';
    }
}
