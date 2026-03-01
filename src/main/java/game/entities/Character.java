package game.entities;

import java.util.List;

public class Character implements Comparable {
    private Stat life;
    private int attack;
    private int speed;
    private int armature;
    private int healing;


    public Character(Stat life,int attack, int speed, int armature, int healing) {
        this.life = life;
        this.attack =  attack;
        this.speed = speed;
        this.armature = armature;
        this.healing = healing;
    }

    public void attack(Character target){
        target.takeDamage(this.attack);
    }

    public void attack(List<Character> targets){
        for (Character target: targets){
            target.takeDamage(this.attack);
        }
    }

    private void takeDamage(int attack) {
        this.life.decrease(resultDamage(attack));
    }

    private int resultDamage(int attack){
        return attack - (attack * this.armature)/100;
    }

    public boolean isDead(){
        return life.isZero();
    }

    public Stat getLife() {
        return life;
    }

    public void setLife(Stat life) {
        this.life = life;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmature() {
        return armature;
    }

    public void setArmature(int armature) {
        this.armature = armature;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    @Override
    public int compareTo(Object object) {
        Character character = (Character) object;
        return Integer.compare(this.speed, character.getSpeed());
    }
}
