package game.controller;

import game.model.Battle;
import game.model.Character;
import game.model.CharactersManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BattleController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        CharactersManager manager =  new CharactersManager(createAllies(), createEnemies());
        Battle battle =  new Battle(manager);
        battle.startBattle();
    }


    private List<Character> createAllies(){
        return null;
    }

    private List<Character> createEnemies(){
        return null;
    }
}
