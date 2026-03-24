package game.controller;

import game.model.Character;

import java.util.List;

abstract class CharacterController {

    public void takeTurn(Character caster, CharactersManager manager){
        applySkill(chooseSkill(), caster, manager);
    }

    private void applySkill(int skill, Character caster, CharactersManager manager){
        switch (skill){
            case 1: caster.attack(chooseRival(caster, manager));
            case 2: caster.guard();
            case 3: caster.healing(chooseMyFella(caster, manager));
        }
    }

    abstract int chooseSkill();

    abstract Character chooseMyFella(Character caster, CharactersManager manager);

    abstract Character chooseRival(Character caster, CharactersManager manager);

}
