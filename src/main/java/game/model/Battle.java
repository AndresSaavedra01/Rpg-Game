package game.model;


import game.controller.CharactersManager;
import game.controller.EnemyIA;
import game.controller.Player;

public class Battle {
    CharactersManager manager;
    TurnManager turnManager;
    Player player ;
    EnemyIA enemyIA;
    boolean isFinish;

    public Battle(CharactersManager manager) {
        this.manager = manager;
        turnManager =  new TurnManager(manager.getAllCharacters());
        player = new Player(manager);
        enemyIA =  new EnemyIA(manager);
    }

    public void startBattle(){
        isFinish = false;
        loopBattle();
    }

    private void loopBattle() {
        while (!isFinish){
            Character currentTurn =  turnManager.getNext();

            if(currentTurn instanceof Ally){
                System.out.println("Player");
                player.takeTurn(currentTurn);
            }
            else {
                System.out.println("Enemy");
                enemyIA.takeTurn(currentTurn);
            }
            isFinish = checkFinish();
        }
    }

    private boolean checkFinish(){
        return manager.areAlliesDead()||
                manager.areEnemiesDead();
    }
}
