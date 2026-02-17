package game.entities.effects;

import game.entities.Character;
import java.util.List;


public interface Effect {

    void apply(List<Character> targets);

}
