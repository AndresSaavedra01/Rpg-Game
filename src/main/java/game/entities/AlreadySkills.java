package game.entities;

import game.entities.effects.DamageEffect;
import game.types.TypeCost;
import game.types.TypeDamage;
import game.types.TypeTarget;

public class AlreadySkills {

    Skill mageSkillOne = new Skill("magic whack", new Cost(8, TypeCost.COST_SP), new DamageEffect(TypeDamage.LIGHT, 30), TypeTarget.ONE_ENEMY);



}
