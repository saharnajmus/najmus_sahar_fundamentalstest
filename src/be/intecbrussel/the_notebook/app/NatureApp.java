package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

import java.util.List;

public class NatureApp {
    public static void main(String[] args) {
        ForestNotebook myForestNoteBook = new ForestNotebook();

        Flower dandelion = new Flower("Dandelion", 0.45);
        dandelion.setSmell(Scent.EARTHY);

        Tree pineTree = new Tree("Pine tree", 46);
        pineTree.setLeafType(LeafType.NEEDLE);

        Weed cannabis = new Weed("Cannabis", 3.5);

        Bush blueberry = new Bush("Blueberry", 3.6);
        blueberry.setLeafType(LeafType.SPEAR);

        Flower daisy = new Flower("Daisy", 0.6);
        daisy.setSmell(Scent.EARTHY);

        Tree bamboo = new Tree("Bamboo");
        bamboo.setLeafType(LeafType.SPEAR);

        Carnivore lion = new Carnivore("Lion", 230, 1.2, 1.5);
        lion.setMaxFoodSize(50);

        Carnivore leopard = new Carnivore("Leopard", 90, 2.1, 2.5);
        leopard.setMaxFoodSize(5);
        Carnivore tiger = new Carnivore("Tiger");

        Carnivore hyenas = new Carnivore("Hyenas");

        Carnivore cougar = new Carnivore("Cougar");

        Carnivore wolf = new Carnivore("Wolf");

        Herbivore deer = new Herbivore("Deer", 9.07, 0.91, 1.8);
        deer.addPlantToDiet(blueberry);

        Omnivore squirrel = new Omnivore("Squirrel", 0.45, 0.18, 0.32);
        squirrel.setMaxFoodSize(0.018);
        squirrel.addPlantToDiet(daisy);

        Omnivore panda = new Omnivore("Panda", 113, 1.7, 1.9);
        panda.addPlantToDiet(bamboo);
        panda.setMaxFoodSize(36.2);

        myForestNoteBook.addPlant(blueberry, daisy, dandelion, bamboo, cannabis);
        myForestNoteBook.addAnimal(tiger, hyenas, leopard, lion, squirrel, panda, deer, cougar, wolf);
        myForestNoteBook.printNotebook();

        List<Carnivore> carnivoreList = myForestNoteBook.getCarnivores();
        System.out.println("***List of Carnivores***");
        carnivoreList.forEach(System.out::println);

        List<Herbivore> herbivoreList = myForestNoteBook.getHerbivores();
        System.out.println("***List of Herbivores***");
        herbivoreList.forEach(System.out::println);

        List<Omnivore> omnivoreList = myForestNoteBook.getOmnivores();
        System.out.println("***List of Omnivores***");
        omnivoreList.forEach(System.out::println);

        System.out.println(" ***Sorted lists by name*** ");
        myForestNoteBook.sortAnimalsByName();
        myForestNoteBook.sortPlantByName();
        myForestNoteBook.printNotebook();


        System.out.println(" ***Sorted lists by height*** ");
        myForestNoteBook.sortAnimalsByHeight();
        myForestNoteBook.sortPlantByHeight();
        myForestNoteBook.printNotebook();


    }
}
