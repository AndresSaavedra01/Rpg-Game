package game.controller;

import java.util.Random;
import java.util.TimerTask;

import game.model.Character;

public class EnemyIA extends CharacterController {

    Random r = new Random();

    public EnemyIA(CharactersManager manager) {
        super(manager);
    }

    @Override
    int chooseSkill() {
        return r.nextInt(1, 3);
    }

    @Override
    public void takeTurn(Character caster) {
        System.out.println("turno de enemigo numero: " + manager.getEnemies().indexOf(caster));
        super.takeTurn(caster);
    }

    @Override
    Character chooseMyFella(Character caster) {
        int choose = r.nextInt(0, manager.getEnemies().size() -1);
        await(caster);
        return manager.getEnemies().get(choose);
    }

    @Override
    Character chooseRival(Character caster) {
        int choose = r.nextInt(0, manager.getAllies().size() -1);
        await(caster);
        return manager.getAllies().get(choose);
    }

    public void await(Character caster) {
        System.out.println("NUmero " +manager.getEnemies().indexOf(caster) + " esta pensando...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("La espera fue interrumpida");
        }
        System.out.println("Termine de pensar...");
    }

}
