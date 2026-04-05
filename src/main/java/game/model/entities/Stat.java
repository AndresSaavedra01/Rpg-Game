package game.model.entities;

public class Stat {

    private int max;
    private int current;

    public Stat(int max) {
        this.max = max;
        this.current = max;
    }

    public void increment(int value){
        current += value;
        if (current > max) current = max;
    }

    public void decrease(int value){
        current -= value;
        if (current < 0) current = 0;
    }

    public boolean isZero(){
        return current == 0;
    }

    public int getCurrent(){
        return current;
    }
}
