package game.controller;

import resources.Images;
import game.model.Battle;
import game.model.Character;
import game.model.Stat;

import java.util.List;

public class BattleController {

    CharactersManager manager;
    Battle battle;
    public BattleController() {
       manager =  new CharactersManager(createAllies(), createEnemies());
       battle = new Battle(manager);
    }

    public CharactersManager getManager() {
        return manager;
    }

    public Battle getBattle() {
        return battle;
    }

    private List<Character> createAllies(){
        Character c = new Character(new Stat(32), Images.cut(Images.fileClerics, false), 32, 12, 4, 3);
        Character v = new Character(new Stat(32), Images.cut(Images.fileClerics, false), 32, 12, 4, 3);
        Character r = new Character(new Stat(32), Images.cut(Images.fileClerics, false), 32, 12, 4, 3);
        return List.of(c, v, r);
    }

    private List<Character> createEnemies(){
        Character c = new Character(new Stat(32), Images.cut(Images.fileClerics, true), 32, 12, 4, 3);
        Character v = new Character(new Stat(32), Images.cut(Images.fileClerics, true), 32, 12, 4, 3);
        Character r = new Character(new Stat(32), Images.cut(Images.fileClerics, true), 32, 12, 4, 3);
        return List.of(c, v, r);
    }
}
