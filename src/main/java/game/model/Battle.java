package game.model;



public class Battle {
    CharactersManager charactersManager;
    TurnManager turnManager;
    boolean isFinish;

    public Battle(CharactersManager charactersManager) {
        this.charactersManager = charactersManager;
        turnManager =  new TurnManager(charactersManager.getAllCharacters());
        isFinish = false;
        loopBattle();
    }


    private void loopBattle() {
        while (!isFinish){
            Character currentTurn =  turnManager.getNext();
            currentTurn.takeTurn(charactersManager);
        }
    }



}
