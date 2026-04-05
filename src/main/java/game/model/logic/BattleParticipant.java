package game.model.logic;

import game.model.entities.Character;

public abstract class  BattleParticipant {
    public void takeTurn(Character caster,CharacterManager manager){
        System.out.println("Es del " + caster.getSide() + " turno de " + caster.getName());
        applySkill(chooseSkill(), caster, manager);
    }

    abstract int chooseSkill();

    private void applySkill(int skill, Character caster, CharacterManager manager) {
        switch (skill){
            case 1 -> caster.attack(chooseRival(manager));
            case 2 -> caster.guard();
            case 3 -> caster.healing(choosePartner(manager));
        }
    }

    abstract Character choosePartner(CharacterManager manager);

    abstract Character chooseRival(CharacterManager manager);

}
