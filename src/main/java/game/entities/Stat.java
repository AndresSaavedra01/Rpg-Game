package game.entities;

import game.types.TypeStat;

public class Stat {

    private int value;
    private TypeStat typeStat;


    public Stat(int value, TypeStat typeStat) {
        this.value = value;
        this.typeStat = typeStat;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void decreaseValue(int value){
        this.value -= value;
    }

    public void incrementValue(int value){
        this.value += value;
    }

    public TypeStat getTypeStat() {
        return typeStat;
    }

    public void setTypeStat(TypeStat typeStat) {
        this.typeStat = typeStat;
    }


}
