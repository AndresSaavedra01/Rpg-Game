package game.entities;

import java.util.List;

public class Player extends Character {

    Skill chooseSkill;

    public Player(String name, List<Skill> skills, CharacterStats stats) {
        super(name, skills, stats);

    }

    @Override
    public Skill chooseSkill() {
        return chooseSkill;
    }

    @Override
    public Character chooseOneAlly(List<Character> allies) {
        return allies.getFirst();
    }

    @Override
    public Character chooseOneEnemy(List<Character> enemies) {
        return enemies.getFirst();
    }


    public void setChooseSkill(Skill chooseSkill){
        this.chooseSkill = chooseSkill;
    }


}
