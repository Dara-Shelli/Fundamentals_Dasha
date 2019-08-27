package entities.animal_entities;


import entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {

    private Set<Plant> plantDiet = new HashSet<>();

    public Herbivore(String name){
        super(name);
    }

    public Herbivore(String name, double weight, double height, double lenght) {
        super(name, weight, height, lenght);

    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

        public void addPlantToDiet(Plant plant){
            if(plant != null && !plantDiet.contains(plant)){
                plantDiet.add(plant);

            }



        }

        public void printDiet(){

            if(plantDiet == null){
                return;
            }
            System.out.println("Diet of " + getName() + " is:");
            plantDiet.forEach(System.out::println);
        }

    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet + "Name " + getName() +
                '}';
    }
}
