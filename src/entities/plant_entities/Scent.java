package entities.plant_entities;

public enum Scent {

    SWEET("Sweet"),
    ORANGE("Orange"),
    PINEAPPLE("Pineapple"),
    MUSKY("Musky"),
    EARTHY("Earthy"),
    SOUR("Sour");

    String scent;

    Scent(String scent){
        this.scent = scent;

    }

    public String getScent(){
        return scent;
    }

    public String toString(){
        return getScent();
    }


}
