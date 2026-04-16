package game.model.logic;

import game.model.entities.Character;

public class Player extends BattleParticipant{

    private int chooseSkill;
    private int target;

    @Override
    int chooseSkill() {
        return chooseSkill;
    }

    @Override
    Character choosePartner(CharacterManager manager) {
        return manager.getAllies().get(target);
    }

    @Override
    Character chooseRival(CharacterManager manager) {
        return manager.getEnemies().get(target);
    }

    public void setChooseSkill(int chooseSkill) {
        this.chooseSkill = chooseSkill;
    }

    public void setTarget(int target) {
        this.target = target;
    }
}
