package game.entities;

import game.entities.effects.Effect;
import game.types.TypeTarget;

import java.util.List;

public class Skill {
    private String name;
    private Cost cost;
    private List<Effect> effects;
    private TypeTarget typeTarget;

    public Skill(String name, Cost cost, List<Effect> effects, TypeTarget typeTarget) {
        this.name = name;
        this.cost = cost;
        this.effects =  effects;
        this.typeTarget = typeTarget;

    }

    public void cast(List<Character> targets){
        for (Effect effect: effects){
            effect.apply(targets);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public List<Effect> getEffects() {
        return effects;
    }

    public void setEffects(List<Effect> effects) {
        this.effects = effects;
    }

    public TypeTarget getTypeTarget() {
        return typeTarget;
    }

    public void setTypeTarget(TypeTarget typeTarget) {
        this.typeTarget = typeTarget;
    }
}
