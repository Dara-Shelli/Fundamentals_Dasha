package service;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ForestNoteBook {

    private List<Carnivore> carnivores;

    private List<Omnivore> omnivores;

    private List<Herbivore> herbivores;

    private int plantCount;

    private int animalCount;

    private List<Animal> animals;

    private List<Plant> plants;


    public ForestNoteBook(){
        carnivores = new ArrayList<>();
        omnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
        animals = new ArrayList<>();
        plants = new ArrayList<>();


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
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(Animal animal){



        for(Animal duplicates: animals){

            if(animal.getName().equals(duplicates.getName())) {
                return;
            }
        }


        animals.add(animal);
        animalCount++;
        addToCorrectList(animal);

    }

    public void addToCorrectList(Animal animal){
        if(animal instanceof Carnivore){
            carnivores.add((Carnivore) animal);
        } else if(animal instanceof Herbivore){
            herbivores.add((Herbivore) animal);

        } else if(animal instanceof  Omnivore){
            omnivores.add((Omnivore) animal);
        }
    }

    public void addPlant(Plant plant){
        for(Plant duplicates: plants){
            if(plant.getName().equals(duplicates.getName())) {
                return;
            }
        }
                plants.add(plant);
                plantCount++;

        }



    public void printNoteBook(){
        System.out.println("All animals list:");
        System.out.println(">>>>>>><<<<<<<<<<<<<");
        animals.forEach(System.out::println);
        System.out.println("All plants list:");
        System.out.println(">>>>>>><<<<<<<<<<<<<");
        plants.forEach(System.out::println);
    }

    public void sortAnimalbyName(){
        this.animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortPlantsByName(){
        this.plants.sort(Comparator.comparing(Plant::getName));

    }

    public void sortAnimalsByHeight(){
        this.animals.sort(Comparator.comparing(Animal::getHeight));


    }


    public void sortPlantsByHeight(){
        this.plants.sort(Comparator.comparing(Plant::getHeight));
    }


}
