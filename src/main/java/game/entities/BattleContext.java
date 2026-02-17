package game.entities;

import java.util.List;

public class BattleContext {

    List<Character> allies;
    List<Character> enemies;
    List<Character> dead;
    TurnManager turnManager;

    public BattleContext(List<Character> allies, List<Character> enemies) {
        this.allies = allies;
        this.enemies = enemies;
    }



    public void passAway() {

        for (int i = 0; i <enemies.size() ; i++){
            Character character = enemies.get(i);
            if (character.isAlieve()) {
                enemies.remove(character);
                dead.add(character);
                i--;
            }
        }

        for (int i = 0; i < allies.size(); i++) {
            Character character = allies.get(i);
            if (character.isAlieve()) {
                allies.remove(character);
                dead.add(character);
                i--;
            }
        }
    }

    public boolean playerIsAlive () {
        for (Character character : dead) {
            if (character instanceof Player) return false;
        }
        return true;
    }


    public boolean isFinish () {
        return !playerIsAlive() && enemies.isEmpty();
    }


    public Character giveNextTurn () {
        if (turnManager.queueIsEmpty()) {
            turnManager.buildQueue(allies, enemies);
        }
        return turnManager.queuePoll();
    }

}
