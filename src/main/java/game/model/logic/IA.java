package game.model.logic;

import game.model.entities.Character;

import java.util.Random;

public class IA extends BattleParticipant{

    Random random =  new Random();

    @Override
    int chooseSkill() {
        return random.nextInt(1, 4);
    }

    @Override
    Character choosePartner(CharacterManager manager) {
        return manager.getEnemies().get(random.nextInt(0, manager.getEnemies().size() + 1));
    }

    @Override
    Character chooseRival(CharacterManager manager) {
        return manager.getAllies().get(random.nextInt(0, manager.getAllies().size() + 1));
    }
}
