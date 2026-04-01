package game.model;

import java.awt.*;

public class Enemy extends Character{

    public Enemy(String name, Stat life, Image aspect, int attack, int speed, int armature, int healing) {
        super(name, life, aspect, attack, speed, armature, healing);
    }
}
