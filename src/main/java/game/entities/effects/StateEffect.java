package game.entities.effects;

import game.entities.Character;
import game.entities.State;

import java.util.List;

public class StateEffect implements Effect{

    State state;

    public StateEffect(State state) {
        this.state = state;
    }

    @Override
    public void apply(List<Character> targets) {
        for (Character character: targets){
            character.setCurrentState(state);
        }
    }
}
