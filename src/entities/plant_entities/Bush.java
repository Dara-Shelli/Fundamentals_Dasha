package entities.plant_entities;

public class Bush extends Plant {

    private String fruit;

    private LeafType leafType;


    public Bush(String name, double height){
        super(name,height);
    }


    public Bush(String name) {
        super(name);

    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "fruit='" + fruit + '\'' +
                ", leafType=" + leafType +
                '}';
    }
}
