package game.model.logic;

import game.model.entities.Character;

import java.util.Comparator;
import java.util.List;

public class CharacterManager {
    private List<Character> characters;
    private int currentIndex;


    public CharacterManager(List<Character> characters) {
        this.characters = characters.stream()
                .sorted(Comparator.comparingInt(o -> o.getSpeed().getCurrent()))
                .toList();
        currentIndex = -1;
    }


    public Character getNext(){
        currentIndex++;
        if(currentIndex >= characters.size())currentIndex = 0;
        Character character =  characters.get(currentIndex);

        if(character.isAlive()) return character;
        else return getNext();
    }


    public boolean alliesDefeat(){
        return getAllies().stream().noneMatch(Character::isAlive);
    }

    public boolean alliesWin(){
        return getEnemies().stream().noneMatch(Character::isAlive);
    }

    public List<Character> getAllies(){
        return characters.stream().filter(Character::isAlly).toList();
    }

    public List<Character> getEnemies(){
        return characters.stream().filter(Character::isEnemy).toList();
    }

}
