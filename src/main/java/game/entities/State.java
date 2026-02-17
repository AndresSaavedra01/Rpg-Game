package game.entities;

import game.types.TypeState;

public class State {

    TypeState typeState;
    int numberOfTurns;

    public State(TypeState typeState, int numberOfTurns) {
        this.typeState = typeState;
        this.numberOfTurns = numberOfTurns;
    }

}
