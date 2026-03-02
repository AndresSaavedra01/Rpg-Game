package game.model;

import java.util.ArrayList;
import java.util.List;

public class CharactersManager {

    private List<Character> allies;
    private List<Character> enemies;
    private List<Character> allCharacters;

    public CharactersManager(List<Character> allies, List<Character> enemies) {
        this.allies = allies;
        this.enemies = enemies;
        allCharacters = new ArrayList<>(allies);
        allCharacters.addAll(enemies);
    }

    public List<Character> getAllCharacters(){
        return allCharacters;
    }

    public List<Character> getAllies() {
        return allies;
    }

    public List<Character> getEnemies() {
        return enemies;
    }


}
