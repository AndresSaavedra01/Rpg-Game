package game.entities;

public class Life {
    int lifeMax;
    int lifeCurrent;

    public Life(int lifeMax) {
        this.lifeMax = lifeMax;
        this.lifeCurrent =  lifeMax;
    }

    public void decreaseLife(int value){
        lifeCurrent -=value;
    }

    public void increaseLife(int value){
        lifeCurrent +=value;
    }

    public int getLifeCurrent() {
        return lifeCurrent;
    }

    public int getLifeMax() {
        return lifeMax;
    }
}
