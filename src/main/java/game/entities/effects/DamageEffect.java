package game.entities.effects;


import game.entities.Character;
import game.types.TypeDamage;

import java.util.List;

public class DamageEffect implements Effect {

    TypeDamage typeDamage;
    public int quality;

    public DamageEffect(TypeDamage typeDamage, int quality) {
        this.typeDamage = typeDamage;
        this.quality = quality;
    }

    @Override
    public void apply(List<Character> targets) {
        for (Character character: targets){
            character.takeDamage(this);
        }
    }

}
