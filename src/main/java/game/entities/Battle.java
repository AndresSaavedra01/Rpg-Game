package game.entities;

import java.util.List;

public class Battle {
    List<Character> allies;
    List<Character> enemies;
    TurnManager turnManager;
    boolean isFinish;

    public Battle(List<Character> allies, List<Character> enemies) {
        this.allies = allies;
        this.enemies = enemies;
        isFinish = false;
        loopBattle();
    }

    private void loopBattle() {
        while (!isFinish){
            Character currentTurn =  turnManager.getNext();
        }
    }


}
