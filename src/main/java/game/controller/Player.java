package game.controller;


import game.model.Character;

public class Player extends CharacterController {

    @Override
    int chooseSkill() {

        return 0;
    }

    @Override
    Character chooseMyFella(Character caster, CharactersManager manager) {
        return null;
    }

    @Override
    Character chooseRival(Character caster, CharactersManager manager) {
        return null;
    }
}
