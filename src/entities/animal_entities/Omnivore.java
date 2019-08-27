package entities.animal_entities;

import entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {

    private Set<Plant> plantDiet = new HashSet<>();

    private double maxFoodSize = 0.0;

    public Omnivore(String name) {
        super(name);

    }

    public Omnivore(String name, double weight, double height, double lenght) {
        super(name, weight, height, lenght);

    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        if(plantDiet != null) {
            this.plantDiet = plantDiet;
        }
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant){
        if(plant != null && !plantDiet.contains(plant)){
            plantDiet.add(plant);

        }

    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize + "Name " + getName() +
                '}';
    }
}
