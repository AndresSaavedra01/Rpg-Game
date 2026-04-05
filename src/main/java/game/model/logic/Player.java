package game.model.logic;

import game.model.entities.Character;

public class Player extends BattleParticipant{

    @Override
    int chooseSkill() {
        return 0;
    }

    @Override
    Character choosePartner(CharacterManager manager) {
        return null;
    }

    @Override
    Character chooseRival(CharacterManager manager) {
        return null;
    }
}
