package game.controller;

import game.model.*;
import game.model.Character;
import resources.Images;

import java.util.List;

public class BattleController {

    private CharactersManager manager;
    private Battle battle;

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
        Character c = new Ally(new Stat(32), Images.cut(Images.fileClerics, false), 32, 12, 4, 3);
        Character v = new Ally(new Stat(32), Images.cut(Images.fileClerics, false), 32, 12, 4, 3);
        Character r = new Ally(new Stat(32), Images.cut(Images.fileClerics, false), 32, 12, 4, 3);
        return List.of(c, v, r);
    }

    private List<Character> createEnemies(){
        Character c = new Enemy(new Stat(32), Images.cut(Images.fileClerics, true), 32, 12, 4, 3);
        Character v = new Enemy(new Stat(32), Images.cut(Images.fileClerics, true), 32, 12, 4, 3);
        Character r = new Enemy(new Stat(32), Images.cut(Images.fileClerics, true), 32, 12, 4, 3);
        return List.of(c, v, r);
    }
}
