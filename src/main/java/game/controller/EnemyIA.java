package game.controller;

import java.util.Random;

import game.model.Character;

public class EnemyIA extends CharacterController {

    Random r = new Random();


    @Override
    int chooseSkill() {
        return r.nextInt(1, 4);
    }

    @Override
    Character chooseMyFella(Character caster, CharactersManager manager) {
        int choose = r.nextInt(0, manager.getEnemies().size() +1);
        return manager.getEnemies().get(choose);
    }

    @Override
    Character chooseRival(Character caster, CharactersManager manager) {
        int choose = r.nextInt(0, manager.getAllies().size() +1);
        return manager.getAllies().get(choose);
    }
}
