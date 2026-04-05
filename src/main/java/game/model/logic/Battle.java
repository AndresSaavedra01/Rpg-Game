package game.model.logic;

import game.model.entities.Character;

import java.util.List;

public class Battle {
    private CharacterManager characterManager;
    private Player player = new Player();
    private IA ia =  new IA();

    public Battle(List<Character> characters) {
        characterManager = new CharacterManager(characters);
        loopBattle();
    }

    private void loopBattle() {

        while (!characterManager.alliesWin() || !characterManager.alliesDefeat()){
            Character current = characterManager.getNext();
            if(current.isAlive()){
                if (current.isEnemy())ia.takeTurn(current, characterManager);
                else player.takeTurn(current, characterManager);
            }
        }

    }


}
