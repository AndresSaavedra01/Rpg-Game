package game.entities;

import java.util.List;

public class Enemy extends Character{

    public Enemy(String name, List<Skill> skills, CharacterStats stats) {
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


}
