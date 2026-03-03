package game.controller;

import game.model.CharactersManager;

public interface CharacterController {

    void takeTurn(CharactersManager manager);

    void chooseTarget(CharactersManager manager);


}
