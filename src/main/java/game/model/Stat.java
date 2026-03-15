package game.model;

public class Stat {
    int max;
    int current;

    public Stat(int max) {
        this.max = max;
        this.current = max;
    }

    public void decrease(int value){
        current -=value;
    }

    public void increaseL(int value){
        current +=value;
    }

    public boolean isZero(){
        return current <= 0;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
