package game.model.logic;

import game.model.entities.Character;

public abstract class  BattleParticipant {
    public void takeTurn(Character caster,CharacterManager manager){
        System.out.println(caster.getName() + " " + caster.getSide());
        System.out.println(caster.getStats().toString());
        applySkill(chooseSkill(), caster, manager);
    }

    abstract int chooseSkill();

    private void applySkill(int skill, Character caster, CharacterManager manager) {
        switch (skill){
            case 1 -> {
                Character target =  chooseRival(manager);
                caster.attack(target);
                System.out.println(caster.getName() + " ataco a " + target.getName() + " ahora tiene " + target.getLife().getCurrent() + " hp");
            }
            case 2 -> {
                caster.guard();
                System.out.println(caster.getName() + " se cubrio");
            }
            case 3 -> {
                Character target =  choosePartner(manager);
                caster.healing(target);
                System.out.println(caster.getName() + " curo a " + target.getName() + " ahora tiene " + target.getLife().getCurrent() + " hp");
            }
        }
    }

    abstract Character choosePartner(CharacterManager manager);

    abstract Character chooseRival(CharacterManager manager);


}
