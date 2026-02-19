package game.entities;

import java.awt.*;
import java.util.List;

public class Enemy extends Character{

    private Image aspect;
    public Enemy(String name, List<Skill> skills, CharacterStats stats, Image aspect) {
        this.aspect = aspect;
        super(name, skills, stats);
    }

    @Override
    public Skill chooseSkill() {
        return skills.getFirst();
    }

    @Override
    public Character chooseOneAlly(List<Character> allies) {
        return allies.getFirst();
    }

    @Override
    public Character chooseOneEnemy(List<Character> enemies) {
        return enemies.getFirst();
    }


    public Image getAspect() {
        return aspect;
    }

    public void setAspect(Image aspect) {
        this.aspect = aspect;
    }
}
