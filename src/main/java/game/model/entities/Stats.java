package game.model.entities;




public class Stats {
    Stat life;
    Stat attack;
    Stat speed;
    Stat armature;
    Stat healing;

    public Stats(int life, int attack, int speed, int armature, int healing) {
        this.life = new Stat(life);
        this.attack = new Stat(attack);
        this.speed = new Stat(speed);
        this.armature = new Stat(armature);
        this.healing = new Stat(healing);
    }

    @Override
    public String toString() {
        return "Stats{" +
                "life=" + life.getCurrent() +
                ", attack=" + attack.getCurrent() +
                ", speed=" + speed.getCurrent() +
                ", armature=" + armature.getCurrent() +
                ", healing=" + healing.getCurrent() +
                '}';
    }
}
