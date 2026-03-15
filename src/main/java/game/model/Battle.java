package game.model;


import game.controller.CharactersManager;

public class Battle {
    CharactersManager charactersManager;
    TurnManager turnManager;
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
            //currentTurn.takeTurn(charactersManager);
            isFinish = checkFinish();
        }
    }

    private boolean checkFinish(){
        return charactersManager.areAlliesDead()||
                charactersManager.areEnemiesDead();
    }
}
