package game.model;


import game.controller.CharactersManager;
import game.controller.EnemyIA;
import game.controller.Player;

public class Battle {
    CharactersManager charactersManager;
    TurnManager turnManager;
    Player player;
    EnemyIA enemyIA;
    boolean isFinish;

    public Battle(CharactersManager charactersManager) {
        this.charactersManager = charactersManager;
        turnManager =  new TurnManager(charactersManager.getAllCharacters());
    }

    public void startBattle(){
        isFinish = false;
        loopBattle();
    }

    private void loopBattle() {
        while (!isFinish){
            Character currentTurn =  turnManager.getNext();

            if(currentTurn instanceof Ally) player.takeTurn(currentTurn, charactersManager);
            else enemyIA.takeTurn(currentTurn, charactersManager);

            isFinish = checkFinish();
        }
    }

    private boolean checkFinish(){
        return charactersManager.areAlliesDead()||
                charactersManager.areEnemiesDead();
    }
}
