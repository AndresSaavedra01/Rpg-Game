package game.entities;

import java.util.Comparator;
import java.util.List;


public class TurnManager {

    List<Character> queue;

    public TurnManager(List<Character> characters) {
        characters.sort(Comparator.comparingInt(Character::getSpeed));
    }


    public Character getNext() {
        return null;
    }
}
