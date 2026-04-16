package game.model.logic;

import game.model.entities.Character;

import java.util.Random;

public class IA extends BattleParticipant{

    private Random random =  new Random();

    @Override
    int chooseSkill() {
        return random.nextInt(1, 4);
    }

    @Override
    Character choosePartner(CharacterManager manager) {
        Character target =  manager.getEnemies().get(random.nextInt(0, manager.getEnemies().size()));

        if(target.isAlive())return target;
        return chooseRival(manager);
    }

    @Override
    Character chooseRival(CharacterManager manager) {
        Character target = manager.getAllies().get(random.nextInt(0, manager.getAllies().size()));

        if(target.isAlive())return target;
        return chooseRival(manager);
    }
}
