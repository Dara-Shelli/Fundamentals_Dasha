package entities.plant_entities;

public enum LeafType {

    NEEDLE("Needle"),
    ROUND("Round"),
    HAND("Hand"),
    HEART("Heart"),
    SPEAR("Spear");

    String description;

    LeafType(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return getDescription();
    }
}
