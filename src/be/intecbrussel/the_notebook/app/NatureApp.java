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
        Flower daisy = new Flower("Daisy", 0.6);
        daisy.setSmell(Scent.EARTHY);

        Tree pineTree = new Tree("Pine tree", 46);
        pineTree.setLeafType(LeafType.NEEDLE);
        Tree bamboo = new Tree("Bamboo", 11.5);
        bamboo.setLeafType(LeafType.SPEAR);
        Tree sugarcane = new Tree("Sugarcane", 6);
        sugarcane.setLeafType(LeafType.SPEAR);
        Tree eucalyptus = new Tree("Eucalyptus", 50.5);
        eucalyptus.setLeafType(LeafType.SPEAR);

        Bush blueberry = new Bush("Blueberry", 3.6);
        blueberry.setLeafType(LeafType.SPEAR);
        blueberry.setFruit("Blueberries");

        Weed cannabis = new Weed("Cannabis", 3.5);
        cannabis.setArea(9.1);

        Carnivore lion = new Carnivore("Lion", 230, 1.2, 1.5);
        lion.setMaxFoodSize(50);
        Carnivore leopard = new Carnivore("Leopard", 90, 2.1, 2.5);
        leopard.setMaxFoodSize(5);
        Carnivore tiger = new Carnivore("Tiger", 220, 1.10, 1.8);
        tiger.setMaxFoodSize(40);
        Carnivore hyena = new Carnivore("Hyenas", 50, 0.81, 1.2);
        hyena.setMaxFoodSize(4);

        Herbivore deer = new Herbivore("Deer", 9.07, 0.91, 1.8);
        deer.addPlantToDiet(blueberry);
        Herbivore elephant = new Herbivore("Elephant", 5000, 3.25, 3.5);
        elephant.addPlantToDiet(sugarcane);
        elephant.addPlantToDiet(dandelion);
        elephant.addPlantToDiet(pineTree);

        Herbivore koala = new Herbivore("Koala", 8.5, 0.85, 0.95);
        koala.addPlantToDiet(eucalyptus);

        Omnivore squirrel = new Omnivore("Squirrel", 0.45, 0.18, 0.32);
        squirrel.setMaxFoodSize(0.018);
        squirrel.addPlantToDiet(daisy);
        squirrel.addPlantToDiet(dandelion);

        Omnivore panda = new Omnivore("Panda", 113, 1.7, 1.9);
        panda.addPlantToDiet(bamboo);
        panda.setMaxFoodSize(36.2);

        myForestNoteBook.addPlant(blueberry, daisy, dandelion, bamboo, cannabis, sugarcane, eucalyptus);
        myForestNoteBook.addAnimal(tiger, hyena, leopard, lion, squirrel, panda, deer, koala, elephant);

        System.out.println("Total number of Plants in my notebook: " + myForestNoteBook.getPlantCount());
        System.out.println("Total number of Animals in my notebook: " + myForestNoteBook.getAnimalCount());

        System.out.println("-----Collection of all Animals and Plants in my Forest Notebook-----");
        myForestNoteBook.printNotebook();

        List<Carnivore> carnivoreList = myForestNoteBook.getCarnivores();
        System.out.println("-----List of Carnivores-----");
        carnivoreList.forEach(System.out::println);

        List<Herbivore> herbivoreList = myForestNoteBook.getHerbivores();
        System.out.println("-----List of Herbivores-----");
        herbivoreList.forEach(System.out::println);

        List<Omnivore> omnivoreList = myForestNoteBook.getOmnivores();
        System.out.println("-----List of Omnivores-----");
        omnivoreList.forEach(System.out::println);

        System.out.println("-----Sorted lists by name-----");
        myForestNoteBook.sortAnimalsByName();
        myForestNoteBook.sortPlantByName();
        myForestNoteBook.printNotebook();


        System.out.println("-----Sorted lists by height-----");
        myForestNoteBook.sortAnimalsByHeight();
        myForestNoteBook.sortPlantByHeight();
        myForestNoteBook.printNotebook();


    }
}
