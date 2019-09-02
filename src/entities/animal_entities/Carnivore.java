package entities.animal_entities;

public class Carnivore extends Animal {

    private double maxFoodSize = 0.0;

    //TODO clean up white spaces below
    public Carnivore(String name) {
        super(name);

    }

    public Carnivore(String name, double weight, double height, double lenght) {
        super(name, weight, height, lenght);

    }


    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "maxFoodSize=" + maxFoodSize + "Name " + getName() +
                '}';
    }
}
