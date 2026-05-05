package game.model.logic;

import game.model.entities.Character;

import java.util.Random;

public class IA extends BattleParticipant{

    private Random random =  new Random();

    @Override
    int chooseSkill() {
        int desition = random.nextInt(1, 4);
        System.out.println(desition);
        return desition;
    }

    @Override
    Character choosePartner(CharacterManager manager) {
        try{
            System.out.println("estoy pensando");
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Character target =  manager.getEnemies().get(random.nextInt(0, manager.getEnemies().size()));

        if(target.isAlive())return target;
        return chooseRival(manager);
    }

    @Override
    Character chooseRival(CharacterManager manager) {
        try{
            System.out.println("estoy pensando");
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Character target = manager.getAllies().get(random.nextInt(0, manager.getAllies().size()));

        if(target.isAlive())return target;
        return chooseRival(manager);
    }
}
