package game.model;

import java.awt.*;

public class Character {
    private Stat life;
    private Image aspect;
    private int attack;
    private int speed;
    private int armature;
    private int healing;

    public Character(Stat life, Image aspect, int attack, int speed, int armature, int healing) {
        this.life = life;
        this.aspect = aspect;
        this.attack =  attack;
        this.speed = speed;
        this.armature = armature;
        this.healing = healing;
    }

    private void attack(Character target){
        target.takeDamage(this.attack);
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

    private void healing(Character target) {
    }

    private void guard() {

    }

    private int selectAction() {
        return 1;
    }

    public Stat getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public int getArmature() {
        return armature;
    }

    public int getHealing() {
        return healing;
    }

    public Image getAspect() {
        return aspect;
    }
}
