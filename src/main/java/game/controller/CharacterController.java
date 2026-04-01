package game.controller;

import game.model.Character;


abstract class CharacterController {

    final CharactersManager manager;
    public CharacterController(CharactersManager manager) {
        this.manager = manager;
    }

    public void takeTurn(Character caster){
        applySkill(chooseSkill(), caster);
    }

    private void applySkill(int skill, Character caster){
        System.out.println("aplicando skill");
        System.out.println("skill value: " + skill);
        switch (skill){
            case 1 ->{
                Character pepe =  chooseRival(caster);
                caster.attack(pepe);
                System.out.println("el men: " + caster.getName() + " ataco a " + pepe.getName());
            }
            case 2 ->{
                caster.guard();
            }
            case 3 -> {
                caster.healing(chooseMyFella(caster));
            }
        }
    }

    abstract int chooseSkill();

    abstract Character chooseMyFella(Character caster);

    abstract Character chooseRival(Character caster);

}
