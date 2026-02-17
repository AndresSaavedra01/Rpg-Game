package game.entities;


import game.entities.effects.DamageEffect;
import game.types.TypeModifierStat;
import game.types.TypeStat;

import java.util.List;

public abstract class Character implements Comparable {

    String name;
    CharacterStats stats;
    List<Skill> skills;
    State currentState;
    SelectorTarget selectorTarget = new SelectorTarget();
    boolean canAttack = true;

    public Character(String name, List<Skill> skills, CharacterStats stats) {
        this.name = name;
        this.stats =  stats;
        this.skills = skills;

    }


    //METHODS

    public abstract Skill chooseSkill();

    public abstract Character chooseOneAlly(List<Character> allies);

    public abstract Character chooseOneEnemy(List<Character> enemies);

    public void takeTurn(BattleContext ctx) {
        selectorTarget.choosePossiblesTargets(this, chooseSkill(), ctx);
    }

    public boolean isAlieve() {
        return stats.getCurrentHP().getValue() > 0;
    }


    public void restoreSP(int value){
        stats.getCurrentSP().incrementValue(value);
    }

    public void restoreHP(int value){
        stats.getCurrentHP().incrementValue(value);
    }

    public void takeDamage(DamageEffect damageEffect){
        stats.getCurrentHP().decreaseValue(damageEffect.quality);
    }

    public void modifyStat(int value, TypeStat typeStat, TypeModifierStat typeModifierStat){
        switch (typeStat){
            case DODGE -> incrementOrDecreaseStat(value, stats.getDodge(), typeModifierStat);
            case SPEED -> incrementOrDecreaseStat(value, stats.getSpeed(), typeModifierStat);
            case DAMAGE -> incrementOrDecreaseStat(value, stats.getDamage(), typeModifierStat);
            case DEFENSE -> incrementOrDecreaseStat(value, stats.getDefense(), typeModifierStat);
            case ACCURACY -> incrementOrDecreaseStat(value, stats.getAccuracy(), typeModifierStat);
            case MAX_HP -> incrementOrDecreaseStat(value, stats.getMaxHP(), typeModifierStat);
            case MAX_SP -> incrementOrDecreaseStat(value, stats.getMaxSP(), typeModifierStat);
            default -> System.out.println("Stat no modifiable");
        }
    }

    private void incrementOrDecreaseStat( int value, Stat stat, TypeModifierStat typeModifierStat){
        switch (typeModifierStat){
            case BUFF -> stat.incrementValue(value);
            case DEBUFF -> stat.decreaseValue(value);
        }
    }




    @Override
    public int compareTo(Object o) {
        Character character = (Character) o;
        return Integer.compare(this.getStats().getSpeed().getValue(),
                character.getStats().getSpeed().getValue());

    }


    //GETTER AND SETTERS

    public CharacterStats getStats() {return stats;}

    public void setStats(CharacterStats stats) {this.stats = stats;}

    public void setCurrentState(State state){this.currentState = state;}

    public State getCurrentState(){return currentState;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
