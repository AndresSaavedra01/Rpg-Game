package game.model.logic;

import game.model.entities.Character;

import java.util.List;

public class Battle {
    private CharacterManager characterManager;
    private Player player = new Player();
    private IA ia =  new IA();
    private Character current;

    public Battle(List<Character> characters) {
        characterManager = new CharacterManager(characters);
    }


    public void nextTurn(){
        if(isBattleDone())return;
        current =  characterManager.getNext();
        if(current.isEnemy()){
            ia.takeTurn(current, characterManager);
            nextTurn();
        }else {
          System.out.println("es turnor de player");
        }
    }

    public void playerTurn(int chooseSkill, int target){
        if(isBattleDone())return;
        if(current.isAlly() && current.isAlive()){
            player.setChooseSkill(chooseSkill);
            player.setTarget(target);
            player.takeTurn(current, characterManager);
            nextTurn();
        }
    }

    public CharacterManager getCharacterManager() {
        return characterManager;
    }

    private boolean isBattleDone(){
        if(characterManager.alliesWin())
            System.out.println("You Win");
        else if (characterManager.alliesDefeat())
            System.out.println("Yoy defeat");
        return characterManager.alliesWin() || characterManager.alliesDefeat();
    }
}
