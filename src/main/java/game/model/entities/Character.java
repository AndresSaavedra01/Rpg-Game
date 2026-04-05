package game.model.entities;

import game.model.entities.Stats;

public class Character {

    private String name;
    private Side side;
    private Stats stats;

    public Character(String name, Side side, Stats stats) {
        this.name = name;
        this.side = side;
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public Side getSide() {
        return side;
    }

    public boolean isAlive(){
        return !getLife().isZero();
    }

    public boolean isEnemy(){
        return side.equals(Side.ENEMY);
    }

    public boolean isAlly(){
        return side.equals(Side.ALLY);
    }

    public Stat getLife() {
        return stats.life;
    }


    public Stat getAttack() {
        return stats.attack;
    }

    public Stat getSpeed() {
        return stats.speed;
    }


    public Stat getArmature() {
        return stats.armature;
    }


    public Stat getHealing() {
        return stats.healing;
    }


}
