package game.model;

import java.util.ArrayList;
import java.util.List;

public class CharactersManager {

    private final List<Character> allies;
    private final List<Character> enemies;
    private final List<Character> allCharacters;

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

    public boolean areAlliesDead(){
        return areAllDead(allies);
    }

    public boolean areEnemiesDead(){
        return areAllDead(enemies);
    }


    private boolean areAllDead(List<Character> characters){
        int cont = 0;
        for (Character character: characters){
            if (character.isDead())cont++;
        }
        return cont == characters.size();
    }

}
