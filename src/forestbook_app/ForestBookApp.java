package forestbook_app;

import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.*;
import service.ForestNoteBook;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

//TODO too much space think about it and clean it up because this isn't clean code
public class ForestBookApp {

    public static void main(String[] args) {

        ForestNoteBook noteBook = new ForestNoteBook();


        // Creating plants

        Tree birchTree = new Tree("Birch Tree", 2.1);
        birchTree.setLeafType(LeafType.HAND);

        Bush hakeaPreissii = new Bush("Hakea preissii", 0.80);
        hakeaPreissii.setLeafType(LeafType.NEEDLE);

        Tree chestNut = new Tree("Chestnut", 3.1);
        chestNut.setLeafType(LeafType.SPEAR);

        Bush raspberries = new Bush("Raspberries", 0.50);
        raspberries.setLeafType(LeafType.ROUND);
        raspberries.setFruit("Raspberries");

        Flower irises = new Flower("Irises", 0.10);
        irises.setSmell(Scent.MUSKY);

        Weed cannabis = new Weed("Cannabis", 0.99);
        cannabis.setArea(6.2);


        // Adding Plats to PlantList

        noteBook.addPlant(birchTree);
        noteBook.addPlant(hakeaPreissii);
        noteBook.addPlant(chestNut);
        noteBook.addPlant(raspberries);
        noteBook.addPlant(irises);
        noteBook.addPlant(cannabis);


        //Creating dietList

        Set<Plant> dietList = new HashSet<>();
        dietList.add(cannabis);
        dietList.add(raspberries);
        dietList.add(chestNut);


        //Creating animals

        Carnivore animal1 = new Carnivore("Lion", 70, 1.2, 1.2);
        animal1.setMaxFoodSize(1);

        Carnivore animal2 =  new Carnivore("Wolf", 60, 1.1, 1.6);
        animal2.setMaxFoodSize(1.2);

        Omnivore animal3 = new Omnivore("Squirrel", 1.2, 0.2,0.22);
        animal3.setMaxFoodSize(0.31);
        animal3.setPlantDiet(dietList);

        Omnivore animal4 = new Omnivore("Hedgehog", 0.7, 0.2, 0.43);
        animal4.setMaxFoodSize(0.44);
        animal4.setPlantDiet(dietList);

        Herbivore animal5 = new Herbivore("Elephant", 30, 2.5, 2.5);
        animal5.setPlantDiet(dietList);

        Herbivore animal6 = new Herbivore("Antelope", 17, 1.4,1.3);

        Carnivore animal7 = new Carnivore("Octopus", 35, 0.70, 0.66);
        animal7.setMaxFoodSize(0.33);

        Omnivore animal8 = new Omnivore("Opossum", 1.3, 0.87, 0.50);
        animal8.setMaxFoodSize(2);
        animal8.setPlantDiet(dietList);

        Herbivore animal9 = new Herbivore("Zebra", 21, 1.6,.7);
        animal9.setPlantDiet(dietList);


        //Adding to Animal list


        noteBook.addAnimal(animal1);
        noteBook.addAnimal(animal2);
        noteBook.addAnimal(animal3);
        noteBook.addAnimal(animal4);
        noteBook.addAnimal(animal5);
        noteBook.addAnimal(animal6);
        noteBook.addAnimal(animal7);
        noteBook.addAnimal(animal8);
        noteBook.addAnimal(animal9);

        System.out.println(noteBook.getPlantCount());
        System.out.println(noteBook.getAnimalCount());
        System.out.println("----------->>>>>>>><<<<<<<<<<-------------");


        // Omnivore,
        // Herbivore,
        // Carnivore

        noteBook.getHerbivores().forEach(System.out::println);
        System.out.println();
        noteBook.getOmnivores().forEach(System.out::println);
        System.out.println();
        noteBook.getCarnivores().forEach(System.out::println);
        System.out.println();






        //Sorting by Name
        System.out.println("Sorted list");
        noteBook.sortAnimalbyName();
        System.out.println();
        noteBook.sortPlantsByName();




        noteBook.printNoteBook();








    }
}
